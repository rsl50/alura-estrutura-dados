package vetor;

public class VetorTeste {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("José");

        // Cria vetor de lista de alunos
        Vetor lista = new Vetor();
        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());

        // Imprime lista de alunos
        System.out.println(lista);

        // Verifica se aluno está no vetor
        System.out.println(lista.contem(a1));
        Aluno a3 = new Aluno("Danilo");
        System.out.println(lista.contem(a3));

        // Adiciona aluno em posição determinada do vetor
        lista.adiciona(1, a3);
        System.out.println(lista);

        // Remove aluno de posição do vetor
        lista.remove(1);
        System.out.println(lista);

        // Teste do aumento automático do tamanho do vetor
        for (int i = 0; i < 300; i++) {
            Aluno a = new Aluno("Carlos " + i);
            lista.adiciona(a);
        }
        System.out.println(lista);
    }
}
