package Projeto3.Cases;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Case1 {
    static final double SALARIOBASE = 2000.0;
    static ArrayList<String> candidatosSelecionados = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Processo seletivo");

        System.out.println("CASE 1: ");
        analisarCandidato(1999.0);
        System.out.println();

        System.out.println("CASE 2: ");
        selecaoDeCandidatos();
        System.out.println();

        System.out.println("CASE 3: ");
        candidatosSelecionados();
        System.out.println();
        System.out.println();

        System.out.println("CASE 4: ");
    }
    public static void ligacaoCandidatos(String respostaCandidato) {
        int tentativa = 0;
        String candidato = "";
        int tentativaCandidato = 0;
        if (tentativa < 3) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " APÓS " + tentativaCandidato + "TENTATIVA(S)");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato);
        }
    }

    //METODO DE NUMERO ALEATORIO
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    //CASE 3 - IMPRIMIR LISTA DE CANDIDATOS SELECIONADOS
    public static void candidatosSelecionados() {
        for (String candidato : candidatosSelecionados) {
            System.out.print(candidato + " ");
        }
    }

    //CASE 2 - SELECIONAR CANDIDATOS
    public static void selecaoDeCandidatos() {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
        int countSelecionados = 0;
        int countPesquisaCandidato = 0;
        for (String candidato : candidatos) {
            double candidatoSalario = valorPretendido();
            if (candidatoSalario <= SALARIOBASE && countSelecionados < 5) {
                candidatosSelecionados.add(candidato);
                countSelecionados++;
                countPesquisaCandidato++;
            } else {
                countPesquisaCandidato++;
            }
        }
        System.out.println("Total de selecionados: " + countSelecionados);
        System.out.println("Total de consultados: " + countPesquisaCandidato);
    }

    //CASE 1
    static void analisarCandidato(double salarioPretendido) {
        if (SALARIOBASE > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (SALARIOBASE == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
    //METODO RANDOM PARA GERAR UM VALOR ALEATORIO
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
