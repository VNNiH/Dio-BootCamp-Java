package collections.generics;

import java.util.List;

public class Main {
    //USANDO CLASSES GENERICAS
    public static void main(String[] args) {
        //BOX SEM GENERICS
        //ESSA BOX É APENAS UMA BOX DE GENERICOS
        //ARMAZENA APENAS UM POR VEZ MAS COLOCA TODOS OS TIPOS DE OBJETOS DENTRO
        Box box = new Box();

        box.setObject("String");
        System.out.println(box.getObject());
        box.setObject(123);
        System.out.println(box.getObject());

        //BOX COM GENERICS
        //USANDO UMA BOX GENERICAS ONDE ESTIPULAMOS QUAL O TIPO QUE ELA VAI ARMAZENAR
        BoxGenerics <String> boxGenerics = new BoxGenerics<>();
        boxGenerics.setT("Java");
        System.out.println(boxGenerics.getT());
        boxGenerics.setT("SQL");
        System.out.println(boxGenerics.getT());

        //BOX COM COLECOES GENERICAS
        // Box para Strings
        BoxCollGenerics<String> stringBox = new BoxCollGenerics<>();
        stringBox.addObject("Hello");
        stringBox.addObject("World");
        List<String> strings = stringBox.getAllObjects();
        for (String str : strings) {
            System.out.println("String: " + str);
        }

        // Box para Integers
        BoxCollGenerics<Integer> integerBox = new BoxCollGenerics<>();
        integerBox.addObject(123);
        integerBox.addObject(456);
        List<Integer> numbers = integerBox.getAllObjects();
        for (Integer number : numbers) {
            System.out.println("Integer: " + number);
        }
    }
}
