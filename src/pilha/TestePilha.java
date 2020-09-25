package pilha;

public class TestePilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        // Teste inserção na pilha
        pilha.push("Robson");
        System.out.println(pilha);
        pilha.push("Guilherme");
        System.out.println(pilha);

        // Teste remoção na pilha
        String r1 = pilha.pop();
        System.out.println(r1);
        String r2 = pilha.pop();
        System.out.println(r2);
        System.out.println(pilha);

        System.out.println(pilha.vazio());
        pilha.push("Robson");
        System.out.println(pilha.vazio());
    }
}
