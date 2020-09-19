import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];

    public void adiciona(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                break;
            }
        }

    }

    public void remove(Aluno aluno) {

    }

    public Aluno pega(Aluno aluno) {
        return null;
    }

    public boolean contem(Aluno aluno) {
        return false;
    }

    public int tamanho() {
        return 0;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }
}
