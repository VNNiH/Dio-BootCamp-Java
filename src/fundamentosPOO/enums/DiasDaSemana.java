package FundamentosPOO.enums;

public enum DiasDaSemana {
    SEGUNDA_FEIRA("Segunda-Feira"),
    TERCA_FEIRA("Terça-Feira"),
    QUARTA_FEIRA("Quarta-Feira"),
    QUINTA_FEIRA("Quinta-Feira"),
    SEXTA_FEIRA("Sexta-Feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    private String diaSemana;

    private DiasDaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

}
