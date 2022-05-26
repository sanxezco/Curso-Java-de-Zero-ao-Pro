package excecao;

public class Basico 
{
    public static void main(String[] args) 
    {
        Aluno a1 = null;

        try
        {
            imprimirNomeAluno(a1);
        }
        catch(Exception e)
        {
            System.out.println("Erro: " + "Nome do aluno não pode ser nulo");
        }

        
        
    }

    public static void imprimirNomeAluno(Aluno aluno)
        {
            System.out.println(aluno.nome);
        }
    
}
