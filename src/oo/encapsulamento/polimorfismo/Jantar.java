package oo.encapsulamento.polimorfismo;

public class Jantar 
{
    public static void main(String[] args) 
    {
        Pessoa convidado = new Pessoa(80);
        Arroz ingrediente1 = new Arroz(0.200);
        Feijao ingrediente2 = new Feijao(0.100);
        
        System.out.println("Peso antes do jantar: " + convidado.getPeso() + " kg");
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        System.out.println("Peso após o jantar: " + convidado.getPeso() + " kg");

        Sorvete ingrediente3 = new Sorvete(0.300);
        convidado.comer(ingrediente3);
        System.out.println("Peso após sobremesa: " + convidado.getPeso() + " kg");
    }
    
}
