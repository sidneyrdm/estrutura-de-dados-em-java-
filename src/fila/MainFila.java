package fila;

public class MainFila {
    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.enqueue(new NoFila("Primeiro"));
        fila.enqueue(new NoFila("Segundo"));
        fila.enqueue(new NoFila("Terceiro"));
        fila.enqueue(new NoFila("Quarto"));

        System.out.println(fila);

        System.out.println(fila.dequeue());

        System.out.println(fila);

        fila.enqueue(new NoFila("Ultimo"));

        System.out.println(fila);

        System.out.println(fila.first());

    }
}
