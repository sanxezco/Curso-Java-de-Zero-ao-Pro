package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        // que caracter esta en el index 2?
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde!";
        System.out.println(s);
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.endsWith("tarde!"));
        System.out.println(s.equalsIgnoreCase("boa tarde!"));

        // para evitar hacer concatenaciones largas usando el +, se usa el metodo
        // 'printf' ... e.g.:
        var nome = "Rances";
        var sobrenome = "Sanchez";
        var idade = 29;
        var salario = 1000.0;
        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f\n", nome, sobrenome, idade, salario); // %s para
                                                                                                            // strings,
                                                                                                            // %d para
                                                                                                            // inteiros,
                                                                                                            // %.2f para
                                                                                                            // floats
                                                                                                            // con 2
                                                                                                            // decimales

        String frase = "Frase qualquer";
        System.out.println(frase.contains("qual")); // existe a palavra 'qual' na frase?
        System.out.println(frase.indexOf("qual")); // ya que existe, que indice?
        System.out.println(frase.substring(6)); // imprimir a partir de um indice
        System.out.println(frase.substring(6, 11)); // imprimir a partir de um indice até outro indice

    }

}
