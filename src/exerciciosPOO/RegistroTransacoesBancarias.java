package exerciciosPOO;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Saldo :");
            double saldo = scanner.nextDouble();

            System.out.println("Quantidade de Transações :");

            // Lê a Entrada com a quantidade total de transações
            int quantidadeTransacoes = scanner.nextInt();

            // Lista para armazenar as transações
            List<String> transacoes = new ArrayList<>();

            // Loop para iterar sobre as transações
            for (int i = 1; i <= quantidadeTransacoes; i++) {
                // Lê a Entrada com o tipo de transação (D para depósito ou S para saque)
                // O método "toUpperCase" padroniza o tipo de transação com a letra maiúscula
                System.out.println("D ou S");
                char tipoTransacao = scanner.next().toUpperCase().charAt(0);
                // Lê a Entrada com o valor da transação
                System.out.println("Valor Transação :");
                double valorTransacao = scanner.nextDouble();

                // Atualiza o saldo da conta e adicionar a transação à lista
                if (tipoTransacao == 'D') {
                    saldo += valorTransacao;
                    transacoes.add("Deposito de " + valorTransacao);
                } else if (tipoTransacao == 'S') {
                    saldo -= valorTransacao;
                    transacoes.add("Saque de " + valorTransacao);
                } else {
                    System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                    i--; // Decrementa o índice para repetir a iteração
                }
            }

            // TODO: Exibir o saldo final e a lista de transações conforme a tabela de Exemplos.
            System.out.println("Saldo : " + saldo);
            int count = 1;
            System.out.println("Transacoes : ");
            for (String transacao : transacoes){
                System.out.println(count + ". " + transacao);
                count++;
            }
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("Erro :" + e);
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
