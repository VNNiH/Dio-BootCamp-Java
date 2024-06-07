package ControleFluxo;

public class Condicionais {
    public static void main(String[] args) {
        double saldo = 16.0;
        double valorSolicitado = 17.0;
        //estrutura condicional simples
        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

        boolean txt = true;
        String resultado = txt ? "True" : "False";
        System.out.println(resultado);
    }
}
