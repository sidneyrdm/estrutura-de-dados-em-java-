package projetoNo;

public class MainNo {
    public static void main(String[] args) {

        No no1 = new No("Conteúdo do No1");

        No no2 = new No("Conteúdo do No2");
        no1.setProximoNo(no2);

        No no3 = new No("Conteúdo do No3");
        no2.setProximoNo(no3);


        No no4 = new No("Conteúdo do No4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}


