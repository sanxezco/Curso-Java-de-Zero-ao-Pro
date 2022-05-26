package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;


public class Pilha {
    public static void main(String[] args) {
        // crear una pila
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Principe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        for (String livro : livros) 
        {
            System.out.println(livro);
        }
        System.out.println();

        // .add() vs .push() -> comportamiento similar, pero, si la lista esta llena,
        // .push() lanza una excepcion si no se puede adicionar el elemento a la pila
        // por restriccion de capacidad

        System.out.println("Primer libro en la pila: " + livros.peek());
        System.out.println("Primer libro en la pila: " + livros.element());
        // usa .poll()
        System.out.println("Primer libro en la pila: " + livros.poll() + " fue eliminado de la pila");
        System.out.println("Primer libro en la pila: " + livros.poll() + " fue eliminado de la pila");
        System.out.println("Primer libro en la pila: " + livros.pop() + " fue eliminado de la pila");
        
        // .poll() vs .pop() -> comportamiento similar, pero, si la lista esta vacia, .pop() lanza una excepcion
        
        

    }

}
