package fundamentos;

public class NotacaPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        // reemplaza X por un texto
        s = s.replace("X", "Mundo");
        // convierte a mayusuclas
        s = s.toUpperCase();
        // concatena con !!!
        s = s.concat(" !!!");

        // otro modo de hacerlo
        String y = "Bom dia X"
        .replace("X", "Mundo")
        .toUpperCase()
        .concat(" !!!");
        System.out.println(y);

        System.out.println(s);

    }
    
}
