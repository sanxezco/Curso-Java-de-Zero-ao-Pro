package colecoes;

import java.util.ArrayList;

public class Lista 
{
    public static void main(String[] args) 
    {
        ArrayList<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Rances"));
        //Lia
        lista.add(new Usuario("Lia"));
        //Bia
        lista.add(new Usuario("Bia"));
        //Manu
        lista.add(new Usuario("Manu"));

        for (Usuario usuario : lista)
        {
            System.out.println(usuario.nome);
        }

        //obtener un elemento de la lista a partir de su posicion
        System.out.println("Elemento en la posicion 2: " + lista.get(2).nome);

        // remover un elemento de la lista a partir de su posicion, y saber cual fue el elemento removido
        System.out.println("Elemento removido: " + lista.remove(2).nome);

        //imprimer la lista
        for (Usuario usuario : lista)
        {
            System.out.println(usuario.nome);
        }
        
        // verifica si Bia esta en la lista
        System.out.println("Bia esta en la lista: " + lista.contains(new Usuario("Bia")));
        
        
    }
    
}
