package Projeto4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saldo:");
        double saldo = scanner.nextDouble();
        System.out.println("Saque:");
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        } else {
            if(saque <= saldo + limiteChequeEspecial){
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            }else{
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }
        scanner.close();
    }
}
