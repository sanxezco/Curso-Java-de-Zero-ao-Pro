package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado 
{
    public static void main(String[] args) 
    {   
        // crear un conjunto de tipo lista
        //Set<String> listaAprovados = new HashSet<String>();  // no es necesario el HashSet<String>, se puede dejar en HashSet<>()
        // para definir un Set que respete el orden del insercion se usa TreeSet<>()
        Set<String> listaAprovados = new TreeSet<>();
        
        // add Ana
        listaAprovados.add("Ana");
        // Carlos
        listaAprovados.add("Carlos");
        //Luca
        listaAprovados.add("Luca");
        //Pedro
        listaAprovados.add("Pedro");
        
        System.out.println("Lista: " + listaAprovados);

        for (String candidatos : listaAprovados)
        {
            System.out.println(candidatos);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n : nums)
        {
            System.out.println(n);
        }
    }

    
}
