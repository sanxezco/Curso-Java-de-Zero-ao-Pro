package classe.desafio;

public class Pessoa {

    String nome;
    double peso;

    Pessoa (String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
    
    void comer(Comida comida) {
        if (comida != null) {
            peso += comida.peso;
        }   
    }

    String apresentacao() {
        return "Olá, meu nome é " + nome + " e eu peso " + peso + " kg.";
    }
}
