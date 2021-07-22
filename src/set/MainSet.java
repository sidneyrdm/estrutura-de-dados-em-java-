package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {
    public static void main(String[] args) {

        Set<Carro> carros = new HashSet<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Fiat"));
        carros.add(new Carro("Peogeot"));
        carros.add(new Carro("Chevrolet"));
        carros.add(new Carro("Zip"));
        carros.add(new Carro("Alfa Romeo"));

        System.out.println(carros);

        Set<Carro> carros1 = new TreeSet<>();

        carros1.add(new Carro("Ford"));
        carros1.add(new Carro("Fiat"));
        carros1.add(new Carro("Peogeot"));
        carros1.add(new Carro("Chevrolet"));
        carros1.add(new Carro("Zip"));
        carros1.add(new Carro("Alfa Romeo"));

        System.out.println(carros1);

    }
}
