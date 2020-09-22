package listaligada;

public class ListaLigada {

    private Celula primeira = null;
    private int totalDeElementos = 0;

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, primeira);
        this.primeira = nova;

        this.totalDeElementos++;
    }

    public void adicionaNoFim(Object elemento) {

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
