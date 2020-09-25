package pilha;

public class TestePilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        // Teste inserção na pilha
        pilha.insere("Robson");
        System.out.println(pilha);
        pilha.insere("Guilherme");
        System.out.println(pilha);

        // Teste remoção na pilha
        String r1 = pilha.remove();
        System.out.println(r1);
        String r2 = pilha.remove();
        System.out.println(r2);
        System.out.println(pilha);
    }
}
