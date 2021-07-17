package pilha;

public class MainPilha {
    public static void main(String[] args) {

         Pilha pilha = new Pilha();
         pilha.push(new NoPilha((1)));
         pilha.push(new NoPilha((2)));
         pilha.push(new NoPilha((3)));
         pilha.push(new NoPilha((4)));
         pilha.push(new NoPilha((5)));
         pilha.push(new NoPilha((6)));

        System.out.println(pilha);

        System.out.println(pilha.pop());

        System.out.println(pilha);

        pilha.push(new NoPilha((7)));

        System.out.println(pilha);

    }
}

