package fundamentos;

public class DesafioAritmetico {
    public static void main(String[] args) {
        int numerador1 = (int) Math.pow((6*(3+2)), 2)/(3*2);

        int numerador2 = (int) Math.pow(((1-5)*(2-7))/2, 2);

        int denominador = (int) Math.pow(10, 3);

        int numerador = (int) Math.pow(numerador1 - numerador2, 3);
        
        System.out.println("Resultado: " + numerador / denominador);
    }
}
