import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {
        //Complexidade O(1) para tempo, muito melhor
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;

        //Complexidade O(n) para tempo
//        for (int i = 0; i < alunos.length; i++) {
//            if (alunos[i] == null) {
//                alunos[i] = aluno;
//                break;
//            }
//        }
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
