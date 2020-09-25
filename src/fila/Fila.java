package fila;

import java.util.LinkedList;

public class Fila {

    LinkedList<String> nomes = new LinkedList();

    public void adiciona(String nome) {
        nomes.add(nome);
    }

    public String remove() {
        return nomes.remove(0);
    }

    public boolean vazio() {
        return nomes.isEmpty();
    }

    @Override
    public String toString() {
        return nomes.toString();
    }
}
