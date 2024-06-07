package Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("Celular");
        //REPRODUÇÃO MUSICAL
        iphone1.tocar();
        iphone1.selecionarMusica("Only Exception");
        iphone1.pausar();
        //APARELHO TELEFONICO
        iphone1.ligar("91 9999999");
        iphone1.atender();
        iphone1.iniciarCorreioVoz();
        //NAVEGAR NA INTERNET
        iphone1.exibirPagina("https://github.com");
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();
    }
}
