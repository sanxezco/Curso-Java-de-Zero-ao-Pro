package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match 
{
    public static void main(String[] args) 
    {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 7.2);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
        Predicate<Aluno> aprovados = a -> a.nota >= 7;

        System.out.println("Todos los alumnos aprovaron? -> " + alunos.stream().allMatch(aprovados));
        System.out.println("Algun alumno aprovó? -> " + alunos.stream().anyMatch(aprovados));
        System.out.println("Ningún alumno aprovó? -> " + alunos.stream().noneMatch(aprovados));        
    }
    
}
