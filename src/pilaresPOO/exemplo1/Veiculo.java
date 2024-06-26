package pilaresPOO.exemplo1;

public abstract class Veiculo {
    private String chassi;
    private String nPlaca;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getnPlaca() {
        return nPlaca;
    }

    public void setnPlaca(String nPlaca) {
        this.nPlaca = nPlaca;
    }
    //O ABSTRACIONIMOS FAZ COM QUE A LÓGICA DO MÉTODO SEJA DEFINIDA APENAS NA CLASSE QUE
    //VAI EXTENDER DESSA NOSSA CLASSE PRINCIPAL
    //ENTAO A CLASS CARRO VAI TER O METODO LIGAR E ELA VAI DEFINIR COMO LIGA
    //ASSIM A MOTO TAMBEM VAI FAZER O MESMO
    public abstract void ligar();
}
