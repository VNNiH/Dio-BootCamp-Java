package ControleFluxo;

public class Repeticao {
    public static void main(String[] args) {
        //esse break faz vir aqui para fora do loop
        for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }
    }
}
