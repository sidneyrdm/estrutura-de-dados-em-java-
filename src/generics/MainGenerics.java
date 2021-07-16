package generics;

import projetoNo.No;

public class MainGenerics {
    public static void main(String[] args) {


        NoGenerics<String> no1 = new NoGenerics<>("Conteúdo do No1");

        NoGenerics<String> no2 = new NoGenerics<>("Conteúdo do No2");
        no1.setProximoNo(no2);

        NoGenerics<String> no3 = new NoGenerics<>("Conteúdo do No3");
        no2.setProximoNo(no3);


        NoGenerics<String> no4 = new NoGenerics<>("Conteúdo do No4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
