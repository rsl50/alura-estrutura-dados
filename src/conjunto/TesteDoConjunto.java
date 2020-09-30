package conjunto;

import java.util.HashSet;
import java.util.Set;

public class TesteDoConjunto {

    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Marcelo");
        System.out.println(conjunto);

        conjunto.adiciona("Guilherme");
        System.out.println(conjunto);


        conjunto.remove("Mauricio");
        System.out.println(conjunto);


        Set<String> conjuntoDoJava = new HashSet<String>();
        conjuntoDoJava.add("Mauricio");
        conjuntoDoJava.add("Paulo");
        System.out.println(conjuntoDoJava);
    }
}
