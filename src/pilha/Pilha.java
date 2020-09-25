package pilha;

import java.util.LinkedList;

public class Pilha {

    private LinkedList<String> nomes = new LinkedList();

    public void insere(String nome) {
        nomes.add(nome);
    }

    public String remove() {
        return null;
    }

    public boolean vazio() {
        return false;
    }

    @Override
    public String toString() {
        return nomes.toString();
    }
}
