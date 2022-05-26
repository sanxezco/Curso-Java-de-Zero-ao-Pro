package br.com.cod3r.exercicessb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.jaxb.SpringDataJaxb.PageRequestDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import br.com.cod3r.exercicessb.model.entities.Produto;
import br.com.cod3r.exercicessb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    /* // de esta manera funciona, pero hay una mas eficiente ... la de abajo
    @PostMapping
    public @ResponseBody Produto novoProduto(
            @RequestParam String nome,
            @RequestParam double preco,
            @RequestParam double desconto) 
    {        
        Produto produto = new Produto(nome, preco, desconto);
        produtoRepository.save(produto);
        return produto;
    }
    */

    // * esta es "la de abajo"
    @PostMapping
    public @ResponseBody Produto novoProduto(@Valid Produto produto)
    {   
        produtoRepository.save(produto);
        return produto; 
    }
    // en el caso de la funcion anteriror, como la logica del POST es igual a la del PUT, se puede usar @RequestMapping(method = RequestMethod.POST, RequestMethod.PUT)
    // En el momento de insertar un producto en la base de datos, se este es enviado sin id, significa que es un nuevo producto, por lo que se debe crear un nuevo objeto, y se debe guardar en la base de datos. Pero si es enviado con id, significa que es un producto existente, por lo que se debe buscar en la base de datos y actualizar los datos.
    
    @GetMapping
    public Iterable<Produto> obterProdutos(){
        return produtoRepository.findAll();    
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id)
    {
        return produtoRepository.findById(id);
    }

    // obter produto por paginas
    @GetMapping("/paginas/{numeroPagina}/{qtdePagina}")
    public Iterable<Produto> obterProdutosPorPagina(
        @PathVariable int numeroPagina,
        @PathVariable int qtdePagina)
    {
        if(qtdePagina >= 5) qtdePagina = 5;
        PageRequest page = PageRequest.of(numeroPagina, qtdePagina);
        return produtoRepository.findAll(page);
    }


    @GetMapping("/nome/{parteNome}")
    public Iterable<Produto> obterProdutoPorNome(@PathVariable String parteNome)
    {
        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }

    @PutMapping
    public Produto alterarProduto(@Valid Produto produto)
    {
        produtoRepository.save(produto);
        return produto;
    }

    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable int id)
    {
        produtoRepository.deleteById(id);
    }

}

