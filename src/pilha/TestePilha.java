package pilha;

import java.util.Stack;

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

        // O Java possui a implementação da pilha internamente
        Stack<String> stack = new Stack<>();
        stack.push("Maurício");
        stack.push("Marcelo");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        // O peek só retorna o elemento no topo da pilha sem removê-lo
        String nome = stack.peek();
        System.out.println(nome);
        System.out.println(stack);

    }
}
