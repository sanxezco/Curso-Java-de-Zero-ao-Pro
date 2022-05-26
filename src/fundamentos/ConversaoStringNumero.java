package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");

        // como los dos valores son String, entonces se pueden concatenar usando +
        System.out.println(valor1 + valor2);

        // se puede convertir a un numero usando parseInt ou parseDouble
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double suma = numero1 + numero2;
        System.out.println("Soma: " + suma);
        //imprime valor de la media
        System.out.println("Media: " + suma / 2);

    }
    
}
