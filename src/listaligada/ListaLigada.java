package listaligada;

public class ListaLigada {

    private Celula primeira = null;
    private Celula ultimo = null;
    private int totalDeElementos = 0;

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, primeira);
        this.primeira = nova;

        if (this.totalDeElementos == 0) {
            this.ultimo = this.primeira;
        }

        this.totalDeElementos++;
    }

    public void adicionaNoFim(Object elemento) {

        if (this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento, null);
            this.ultimo.setProximo(nova);
            this.ultimo = nova;
            this.totalDeElementos++;
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private Celula pegaCelula(int posicao) {
        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição Inexistente");
        }

        Celula atual = primeira;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

    public void adiciona(int posicao, Object elemento) {

        if (posicao == 0) {
            adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeElementos) {
            adicionaNoFim(elemento);
        } else {
            // Pega a posição anterior, vê qual era a próxima célula e atribui isso
            // na nova celula, por fim coloca a nova célula como próxima da celula
            // anterior
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(elemento, anterior.getProximo());
            anterior.setProximo(nova);
            this.totalDeElementos++;
        }
    }

    public Object pega(int posicao) {

        return null;
    }

    public Object remove(int posicao) {

        return null;
    }

    public int tamanho() {

        return 0;
    }

    public boolean contem(Object o) {

        return false;
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }

        Celula atual = primeira;

        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");

            atual = atual.getProximo();
        }
        builder.append("]");

        return builder.toString();
    }
}
