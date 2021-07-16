import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("intA= "+intA+" intB= "+intB);

        intA = 2;

        System.out.println("intA= "+intA+" intB= "+intB);

        MeuObjeto meuObjetoA = new MeuObjeto(10);
        MeuObjeto meuObjetoB = meuObjetoA;
        System.out.println("meuObjetoA= "+meuObjetoA+" meuObjetoB= "+meuObjetoB);


        meuObjetoA.setNumero(20);
        System.out.println("meuObjetoA= "+meuObjetoA+" meuObjetoB= "+meuObjetoB);

    }

}

