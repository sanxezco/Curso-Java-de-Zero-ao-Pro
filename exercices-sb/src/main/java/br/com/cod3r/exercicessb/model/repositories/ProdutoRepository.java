package br.com.cod3r.exercicessb.model.repositories;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.exercicessb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> 
{
    public Iterable<Produto> findByNomeContaining(String parteNome);
    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

    
}
