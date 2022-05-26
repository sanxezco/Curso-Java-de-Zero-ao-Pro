package controle;
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int notaValida = 0;
        double nota =0;
        double media = 0;
        double suma = 0;
        
        while(nota != -1){
            System.out.print("Informe a nota ou -1 para sair: ");
            nota = in.nextDouble();

            if(nota <= 10 && nota >= 0){
                notaValida ++;
                suma += nota;
            } else if (nota != -1){
                System.out.println("Nota invalida");
            }    
        }
        media = suma / notaValida;
        System.out.println("Media: " + media);
        in.close();  
    }   
}
