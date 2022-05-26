package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos 
{
    public static void main(String[] args) 
    {
        List<String> aprovados = Arrays.asList("Lu","Gui","Luca","Ana");

        System.out.println("--------------------------------------\n"+
                           "Imprimindo objetos com for tradicional\n"+
                           "--------------------------------------");
        for(int i = 0; i < aprovados.size(); i++)
        {
            System.out.println("Aprovado: " + aprovados.get(i));
        }
        
        System.out.println("-------------------------------\n"+
                           "Imprimindo objetos com for each\n"+
                           "-------------------------------");
        for(String nome: aprovados)
        {
            System.out.println("Aprovado: " + nome);
        }

        System.out.println("-----------------------------------\n"+
                            "Imprimindo objetos usando Interator\n"+
                            "-----------------------------------");
        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Aprovado: " + iterator.next());
        }

        System.out.println("-----------------------------------\n"+
        "Imprimindo objetos usando Stream\n"+
        "-----------------------------------");
        Stream<String> stream = aprovados.stream(); 
        stream.forEach(System.out::println);
    }
    
}
