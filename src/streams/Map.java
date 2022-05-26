package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map 
{
    public static void main(String[] args) 
    {
        Consumer<String> print = System.out::print;   

        List<String> marcas = Arrays.asList("BMW ","Audi ","Honda \n");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!! ";

        marcas.stream().map(maiuscula).forEach(print);
        System.out.println("\n");
        marcas.stream().map(primeiraLetra).forEach(print);
        System.out.println("\n");
        marcas.stream().map(grito).forEach(print);

        marcas.stream().map(primeiraLetra.andThen(grito)).forEach(print);
    }
    
}
