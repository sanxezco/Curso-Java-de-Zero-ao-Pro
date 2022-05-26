package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra 
{
    // relacion de una compra con varios itens
    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int qtde)
    {
        this.itens.add(new Item(p,qtde));
    }

    void adicionarItem(String nome, double perco, int qtde)
    {
        var produto = new Produto(nome,perco);
        this.itens.add(new Item(produto,qtde));
    }

    double obterValorTotal()
    {
        double total = 0;
        for(Item item : itens)
        {
            total += item.produto.preco * item.quantidade;
        }
        return total;
    }
}
