package EstruturasExcepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class FluxoExcecoes {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try{
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();
            //imprimindo os dados obtidos pelo usuario
            scanner.close();
        }
        catch (Exception e){
            System.err.println("Campos idade e altura devem ser numericos");
        }
//        catch ()
    }
}
