package Iphone;

public class Iphone {
    String nome;

    public Iphone(String nome) {
        this.nome = nome;
    }
    //REPRODUTOR MUSICAL
    public void tocar(){
        System.out.println("Tocando Música");
    }
    public void pausar(){
        System.out.println("Pausar Música");
    }
    public String selecionarMusica(String musica){
        System.out.println("Tocando: " + musica);
        return musica;
    }
    //Aparelho Telefonico
    public String ligar(String numero){
        System.out.println("Ligando para: " + numero);
        return numero;
    }
    public void atender(){
        System.out.println("Atendendo ligação");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de Voz");
    }
    //Navegador na Internet
    public String exibirPagina(String url){
        System.out.println("Página: " + url);
        return url;
    }
    public void adicionarNovaAba(){
        System.out.println("Nova Aba Adicionada");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }
}
