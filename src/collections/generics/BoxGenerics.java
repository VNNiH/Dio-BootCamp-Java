package collections.generics;
//passamos o <T> para indicar que aceita um parametro de um tipo de Object ainda não especificado
//STRING INTEGER DOUBLE
public class BoxGenerics <T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
