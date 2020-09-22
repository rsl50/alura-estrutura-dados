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
