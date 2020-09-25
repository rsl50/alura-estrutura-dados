package pilha;

import java.util.LinkedList;

public class Pilha {

    private LinkedList<String> nomes = new LinkedList();

    public void push(String nome) {
        nomes.add(nome);
    }

    public String pop() {
        return nomes.remove(nomes.size() - 1);
    }

    public boolean vazio() {
        return nomes.isEmpty();
    }

    @Override
    public String toString() {
        return nomes.toString();
    }
}
