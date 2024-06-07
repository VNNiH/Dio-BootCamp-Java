package Projeto4;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor de Saque Máximo no dia");
        double limiteDiario = scanner.nextDouble();

        for (int i = 1; i < limiteDiario; i++) {
            System.out.println("Valor do Saque: ");
            double valorSaque = scanner.nextDouble();
            double resto = limiteDiario - valorSaque;
            limiteDiario -= valorSaque;
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                System.out.println("Limite restante: " + resto);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
