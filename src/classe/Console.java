package classe;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite um sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite uma idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.printf("Seu nome é: %s %s e tem %d anos", nome, sobrenome, idade);

        //fechar entrada
        entrada.close();        

    }

}
