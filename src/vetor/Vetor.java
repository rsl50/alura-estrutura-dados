package vetor;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    private void garanteEspaco() {
        if (totalDeAlunos == alunos.length) {
            Aluno[] novoArray = new Aluno[alunos.length * 2];

            for (int i = 0; i < alunos.length; i++) {
                novoArray[i] = alunos[i];
            }

            this.alunos = novoArray;
        }
    }

    public void adiciona(Aluno aluno) {
        this.garanteEspaco();

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

    private boolean posicaoValida(int posicao) {
        return posicao >=0 && posicao <= totalDeAlunos;
    }

    public void adiciona(int posicao, Aluno aluno) {
        this.garanteEspaco();

        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        //Complexidade O(n)
        for (int i = totalDeAlunos - 1; i >= posicao; i--) {
            alunos[i + 1] = alunos[i];
        }

        alunos[posicao] = aluno;
        totalDeAlunos++;
    }

    public void remove(int posicao) {
        //Complexidade O(n)
        for (int i = posicao; i < this.totalDeAlunos; i++) {
           this. alunos[i] = alunos[i + 1];
        }

        totalDeAlunos--;
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
