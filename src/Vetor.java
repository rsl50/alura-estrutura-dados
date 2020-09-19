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

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    public Aluno pega(int posicao) {

        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return alunos[posicao];
    }

    public boolean contem(Aluno aluno) {

        //Complexidade O(n)
        for (int i = 0; i < totalDeAlunos; i++) {
            if (aluno.equals(alunos[i])) {
                return true;
            }
        }

        return false;
    }

    public int tamanho() {
        return totalDeAlunos;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }
}
