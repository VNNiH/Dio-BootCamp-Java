package OpUnario;

public class Operador {
    public static void main(String[] args) {
        //numero positivo
        int numero = 5;
        //numero negativo
        System.out.println(- numero);
        //incremetando +1
        numero++;
        System.out.println(numero);
        //incremetando numero dentro de um método
        //primeiro print dps atualiza valor
        System.out.println(numero ++);
        System.out.println(numero);
        //ordem precedencia
        //atualiza valor e print
        System.out.println(++ numero);
        //OPERADOR TERNARIO
        //<Expressão Condicional>?<condição true>:<condição false>
        int a = 5;
        int b = 6;
        boolean result = (a == b) ? true: false;
        System.out.println(result);
        //COMPARANDO OBJETOS E NUMEROS
        //comparacao de numeros usando comparador relacional
        System.out.println(a==b);
        //comparacao de objetos usando equals
        String nomeUm = "A";
        String nomeDois = "B";
        System.out.println(nomeUm.equals(nomeDois));
    }
}
