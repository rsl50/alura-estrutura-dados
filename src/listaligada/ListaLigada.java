package listaligada;

public class ListaLigada {

    private Celula primeira = null;
    private Celula anterior = null;
    private Celula ultimo = null;
    private int totalDeElementos = 0;


    public void adicionaNoComeco(Object elemento) {
        if (this.totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultimo = nova;
        } else {
            Celula nova = new Celula(elemento, this.primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }

        this.totalDeElementos++;
    }

    public void adicionaNoFim(Object elemento) {

        if (this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultimo.setAnterior(nova);
            nova.setAnterior(this.ultimo);
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
        return this.pegaCelula(posicao).getElemento();
    }

    public void removeDoComeco() {
        if (this.totalDeElementos == 0) {
            throw new IllegalArgumentException("Lista vazia");
        }

        this.primeira = this.primeira.getProximo();
        this.totalDeElementos--;

        if (this.totalDeElementos == 0) {
            this.ultimo = null;
        }
    }

    public Object remove(int posicao) {

        return null;
    }

    public int tamanho() {
        return this.totalDeElementos;
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
