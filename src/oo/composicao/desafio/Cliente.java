package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente 
{   
    final String nome;
    // relacion de un cliente con varias compras
    final List<Compra> compras = new ArrayList<>();
    

    Cliente(String nome)
    {
        this.nome = nome;
    }

    double obterValorTotal()
    {
        double total = 0;
        for(Compra compraActual: this.compras)
        {
            total += compraActual.obterValorTotal();
        }
        return total;
    }

    void adicionarCompra(Compra compra)
    {
        this.compras.add(compra);
    }
}
