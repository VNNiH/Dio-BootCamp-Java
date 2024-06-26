package FundamentosPOO.enums;

public class Main {
    public static void main(String[] args) {
        for(DiasDaSemana e : DiasDaSemana.values()){
            System.out.println("Dia da Semana : " + e.getDiaSemana());
        }
        for(EstadoBrasileiro e : EstadoBrasileiro.values()){
            System.out.println("Nome : " + e.getNomeMaiusculo() + " Sigla : " + e.getSigla());
        }
    }
}
