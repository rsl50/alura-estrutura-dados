package fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("Robson");
        fila.adiciona("Guilherme");
        System.out.println(fila);

        String r1 = fila.remove();
        System.out.println(r1);
        System.out.println(fila);

        System.out.println(fila.vazio());
        fila.remove();
        System.out.println(fila.vazio());

        // O Java possui uma implementação própria de Fila
        Queue<String> filaDoJava = new LinkedList<>();
        filaDoJava.add("Maurício");
        String r2 = filaDoJava.poll();
        System.out.println(r2);
    }
}
