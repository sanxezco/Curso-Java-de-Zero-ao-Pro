package controle;

public class CaseSwitch {
    public static void main(String[] args) {
        String faixa = "preto";

        switch (faixa.toLowerCase()) {
            case "preto":   
                System.out.println("Você sabe Bassai-Dai.");
            case "marrom":
                System.out.println("Você sabe Tekki Shodan.");
            case "roxa":
                System.out.println("Você sabe Heian Godan.");
            case "verde":
                System.out.println("Você sabe Heian Yodan.");
            case "laranja":
                System.out.println("Você sabe Heian Sandan.");
            case "vermelha":
                System.out.println("Você sabe Heian Nidan.");
            case "amarela":
                System.out.println("Você sabe Heian Shodan.");
                break;
            default:
                System.out.println("Você não sabe nada.");
        }
    }    
}
