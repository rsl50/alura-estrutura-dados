package listaligada;

public class TestaListaLigada {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        // Teste de adicionar itens no começo da lista
        System.out.println(lista);
        lista.adicionaNoComeco("Robson");
        System.out.println(lista);
        lista.adicionaNoComeco("Paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("Carlos");
        System.out.println(lista);

        // Teste de adicionar itens no fim da lista
        lista.adicionaNoFim("Marcelo");
        System.out.println(lista);

        // Teste de adicionar itens no meio da lista
        lista.adiciona(2, "Gabriel");
        System.out.println(lista);

        // Teste pegar item de posição da lista e tamanho da lista
        Object a = lista.pega(2);
        System.out.println(a);
        System.out.println(lista.tamanho());

        // Teste remover item do começo da lista
        lista.removeDoComeco();
        System.out.println(lista);
        System.out.println(lista.tamanho());

        // Teste remover item do final da lista
        lista.removeDoFim();
        System.out.println(lista);
        System.out.println(lista.tamanho());

        // Teste remoção de qualquer posição
        lista.adicionaNoFim("José");
        lista.adicionaNoFim("João");
        System.out.println(lista);

        lista.remove(3);
        System.out.println(lista);


    }
}
