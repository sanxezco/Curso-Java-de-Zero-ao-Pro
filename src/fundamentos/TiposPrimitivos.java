package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informação do funcionario
        
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L; // L indica que é um long
        float salario = 11_445.44F; // F indica que é um float
        double vendasAcumuladas = 2_991_797_103.01; 
        boolean estaDeFerias = false;
        char status = 'A'; //aceita apenas um caracter
        // Dias de empresa
        System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
        //Número de viagens
        System.out.println("Número de viagens: " + numeroDeVoos/2);
        // Pontos por real
        System.out.println("Pontos por real: " + pontosAcumulados/vendasAcumuladas);
        //Salário por id
        System.out.println(id + ": ganha -> " + salario);
        //Esta de ferias
        System.out.println("Esta de ferias? -> " + estaDeFerias);
        //Status
        System.out.println("Status: " + status);
    }
}
