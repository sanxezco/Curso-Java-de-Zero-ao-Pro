package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach 
{
    public static void main(String[] args) 
    {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        System.out.println("Forma tradicional ... ");
        for (String nome : aprovados) 
        {
            System.out.println(nome);
        }

        System.out.println("Forma lambda #01... ");
        aprovados.forEach(nome -> System.out.println(nome));

        System.out.println("Method Reference #01... ");
        aprovados.forEach(System.out::println);

        System.out.println("Forma lambda #02 (funcion personalizada)... ");
        aprovados.forEach(nome -> meuImprimir(nome));
        
        System.out.println("Method Reference #02... ");
        aprovados.forEach(Foreach::meuImprimir);

    }

    static void meuImprimir(String nome)
    {
        System.out.println("Oi, meu nome é " + nome);
    }
    
}
