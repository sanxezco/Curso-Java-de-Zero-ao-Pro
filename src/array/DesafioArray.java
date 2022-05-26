package array;

import java.util.Scanner;

public class DesafioArray
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("Quantas notas?: ");
        int qtdeNotas = in.nextInt();

        double notas[] = new double[qtdeNotas];

        for(int i = 0; i < notas.length; i++)
        {
            System.out.printf("Digite a nota %d: ", i+1);
            notas[i] = in.nextDouble();            
        }

        double total = 0;
        for( double nota : notas)
        {
            total += nota;
        }

        System.out.printf("Media: %.2f", total / notas.length);
        
        in.close();
    }  
}
