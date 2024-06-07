package Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("Vinicius Celular");
        //REPRODUÇÃO MUSICAL
        iphone1.tocar();
        iphone1.selecionarMusica("Only Exception");
        iphone1.pausar();
        //APARELHO TELEFONICO
        iphone1.ligar("91 981655616");
        iphone1.atender();
        iphone1.iniciarCorreioVoz();
        //NAVEGAR NA INTERNET
        iphone1.exibirPagina("https://github.com/VNNiH");
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();
    }
}
