package pilaresPOO.exemplo1;

public class Carro extends Veiculo{

    //Esses métodos precisam ser encapsulados pelo fato de não importarem para o usuário
    private void confereCambio(){
        System.out.println("Conferindo gasolina...");
    }

    private void confereCombustivel(){
        System.out.println("Conferindo cambio...");
    }
    @Override
    public void ligar() {
        System.out.println("CARRO LIGADO");
    }
}
