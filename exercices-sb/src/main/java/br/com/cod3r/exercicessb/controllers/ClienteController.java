package br.com.cod3r.exercicessb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exercicessb.model.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController 
{
    @GetMapping("/qualquer")
    public Cliente obterCliente()
    {
        return new Cliente(29, "Rances", "123.456.789-00");
    }   

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id)
    {
        return new Cliente(id,"Maria", "987.654.321-00");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id") int id)
    {
        return new Cliente(id, "João Augusto", "111.222.333-44");
    }
}
