package lambdas;

public class CalculoTeste_Lambda 
{
    public static void main(String[] args) 
    {
        Calculo calculo = (a, b) -> a + b;
        System.out.println(calculo.executar(2, 3));
        
        calculo = (a, b) -> a * b;
        System.out.println(calculo.executar(2, 3));
        
    }
        
}
    


