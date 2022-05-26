package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        // adicional Ana
        fila.add("Ana");
        // metodo .offer() intenta adicionar elemento na fila e retorna true se
        // adicionado com sucesso
        boolean adicionou = fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println("Bia fue adicionada? " + adicionou);

        // coger el primer elemento de la fila usando .peek()
        System.out.println("Primer elemento: " + fila.peek());
        // coger primer elemento de la fila usando .element()
        System.out.println("Primer elemento: " + fila.element());
        // .peek() vs .element() -> comportamiento similar, pero, si la lista esta
        // vacia, .element() lanza una excepcion

        // limpiar fila
        // fila.clear();
        // tamaño de la fila
        System.out.println("Tamaño de la fila: " + fila.size());
        // verificar si la fila esta vacia
        System.out.println("Fila vacia? " + fila.isEmpty());

        // retorna el primer elemento de la fila y borralo de la fila
        System.out.println("Primer elemento: " + fila.poll() + " fue elimindao de la fila");
        System.out.println("Primer elemento: " + fila.poll() + " fue elimindao de la fila");
        System.out.println("Primer elemento: " + fila.poll() + " fue elimindao de la fila");
        // tamaño de la fila
        System.out.println("Tamaño de la fila: " + fila.size());

        //remover elemento de la fila
        System.out.println("Elemento: " + fila.remove() + " fue elimindao de la fila");

        // .poll() vs .remove() -> comportamiento similar, pero, si la lista esta vacia, .remove() lanza una excepcion
    }

}
