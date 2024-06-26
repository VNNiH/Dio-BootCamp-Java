package collections.generics;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {

        // Criando uma ArrayList sem especificar o tipo
        ArrayList lista = new ArrayList();

        // Adicionando elementos de diferentes tipos
        lista.add("Texto");
        lista.add(123);
        lista.add(45.67);
        // Recuperando e imprimindo elementos - casting necessário
        String texto = (String) lista.get(0);
        Integer numero = (Integer) lista.get(1);
        Double doubleA = (Double) lista.get(2);

        System.out.println("Texto: " + texto);
        System.out.println("Número: " + numero);
        System.out.println("Double: " + doubleA);
        //USANDO GENERICS
        //DECLARANDO O TIPO DE OBJETO
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("SQL");
        //Recuperando os valores sem necessidade de casting
        String txt1 = listaStrings.get(0);
        String txt2 = listaStrings.get(1);
        System.out.println(txt1);
        System.out.println(txt2);
    }
}
