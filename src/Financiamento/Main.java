package Financiamento;

public class Main {
    public static void main(String[] args) {
        double valorTotal = 1000.0;
        double entrada = 100.0;
        int parcelas = 5;

        try {
            Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println(f.prestacao());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
//REGRAS DE NEGOCIO
//entrada precisa ser 20% do valor total
//numero minimo de prestacao é 6
//valorTotal e Entrada precisam ser Double
//parcelas tem de ser inteiras
//valores nao podem ser nulos