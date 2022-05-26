package oo.composicao;

public class CursoTeste 
{
    public static void main(String[] args) 
    {
        Aluno aluno1 = new Aluno("Rances");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");    

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Python");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);


        System.out.println("Lista de alunos do curso " + curso1.nome);
        for (Aluno aluno : curso1.alunos)
        {
            System.out.println("--- " + aluno.nome + " ---");
        }

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
        if(cursoEncontrado != null)
        {
            System.out.println(cursoEncontrado.nome);
            System.out.println("Lista de alunos do curso " + cursoEncontrado.alunos.toString());
        } 
        else
        {
            System.out.println("Curso não encontrado");
        }
    }   
}
