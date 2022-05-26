package fundamentos;

public class DataTest {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 7;
        d1.mes = 11;
        d1.ano = 2022;
        System.out.println(d1.obterFormatada());
        System.out.printf("%d/%d/%d %n", d1.dia, d1.mes, d1.ano);
    
    }
    
}
