package pilaresPOO.mensagens;

public class Main {
    public static void main(String[] args) {
        ServicoComum smi = null;
        //QUAL APP NOS IREMOS ESCOLHER?
        String appEscolhido = "msn";
        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("telegram"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
