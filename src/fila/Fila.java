package fila;

import java.util.LinkedList;

public class Fila {

    LinkedList<String> nomes = new LinkedList();

    public void adiciona(String nome) {
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
