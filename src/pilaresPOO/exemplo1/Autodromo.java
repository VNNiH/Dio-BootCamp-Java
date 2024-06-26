package pilaresPOO.exemplo1;

public class Autodromo {

    public static void main(String[] args) {
        Carro jeep = new Carro();
//        jeep.ligar();
        jeep.setChassi("02839120");
        System.out.println("Chassi Número: " + jeep.getChassi());

        Moto F400 = new Moto();
//        F400.ligar();
        F400.setChassi("921310293");
        System.out.println("Chassi Número: " + F400.getChassi());

        Veiculo coringa = jeep;
        Veiculo coringa2 = F400;
        coringa.ligar();
        coringa2.ligar();
    }
}
