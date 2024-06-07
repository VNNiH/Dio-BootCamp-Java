import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        System.out.println("1 - DEPOSITAR  ");
        System.out.println("2 - EXTRATO    ");
        System.out.println("3 - SALDO ATUAL");

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor à depositar :");
                    int deposito = scanner.nextInt();
                    saldo +=deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.print("Valor à sacar :");
                    int saque = scanner.nextInt();
                    if (saque > saldo){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        System.out.println("SAQUE : "+ saque);
                        saldo -= saque;
                    }
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}