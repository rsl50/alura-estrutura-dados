package conjunto;

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
    }
}
