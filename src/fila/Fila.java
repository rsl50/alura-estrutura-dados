package fila;

import java.util.LinkedList;

public class Fila {

    LinkedList<String> nomes = new LinkedList();

    public void add(String nome) {
        nomes.add(nome);
    }

    public String poll() {
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
