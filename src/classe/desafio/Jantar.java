package classe.desafio;

public class Jantar {
    public static void main(String[] args) {
        Comida comida1 = new Comida("Arroz", 0.180);
        Comida comida2 = new Comida("Feijão", 0.300);

        Pessoa pessoa1 = new Pessoa("Rances", 80.0);
     
        System.out.println(pessoa1.apresentacao());

        pessoa1.comer(comida1);

        System.out.println(pessoa1.apresentacao());
        pessoa1.comer(comida2);
        System.out.println(pessoa1.apresentacao());
    }    
}
