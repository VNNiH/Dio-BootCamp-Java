package collections.list.somaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int somaTotal = 0;
        for (Integer i : listaNumeros) {
            somaTotal += i;
        }
        return somaTotal;
    }

    public int encontrarMaiorNumero() {
        if (listaNumeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia.");
        }
        int maiorNumero = listaNumeros.get(0); // Inicializa com o primeiro elemento da lista
        for (Integer i : listaNumeros) {
            if (i > maiorNumero) {
                maiorNumero = i;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        if (listaNumeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia.");
        }
        int menorNumero = listaNumeros.get(0); // Inicializa com o primeiro elemento da lista
        for (Integer i : listaNumeros) {
            if (i < menorNumero) {
                menorNumero = i;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(100);
        somaNumeros.adicionarNumero(2123123);
        somaNumeros.adicionarNumero(33131);
        somaNumeros.adicionarNumero(-431);
        somaNumeros.adicionarNumero(53123);

        somaNumeros.exibirNumeros();
        System.out.println("Soma dos Números : " + somaNumeros.calcularSoma());
        System.out.println("Maior número : " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número : " + somaNumeros.encontrarMenorNumero());
    }
}
