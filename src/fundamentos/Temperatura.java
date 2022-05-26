package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        double fahrenheit = 100;
        final double AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println(fahrenheit + " grados fahrenheit son " + celsius + " grados celsius");
    }

}
