package lista.listaDuplamenteEncadeada;

public class MainListaDuplamenteEncadeada {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaListaDE = new ListaDuplamenteEncadeada<>();

        minhaListaDE.add("c1");
        minhaListaDE.add("c2");
        minhaListaDE.add("c3");
        minhaListaDE.add("c4");
        minhaListaDE.add("c5");
        minhaListaDE.add("c6");
        minhaListaDE.add("c7");

        System.out.println(minhaListaDE);

        minhaListaDE.remove(3);
        minhaListaDE.add(3,"c9");
        System.out.println(minhaListaDE.get(3));


    }
}
