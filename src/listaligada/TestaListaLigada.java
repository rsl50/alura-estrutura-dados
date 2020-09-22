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
    }
}
