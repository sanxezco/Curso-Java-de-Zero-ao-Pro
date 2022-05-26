package array;
import java.util.Arrays;

public class ExercicioArray {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        System.out.println("Notas do aluno A: " + Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println("Notas do aluno A: " + Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }

        //calcula a media
        double media = total / notasAlunoA.length;
        //imprime a media
        System.out.println("Media do aluno A: " + media);
    }
    
}
