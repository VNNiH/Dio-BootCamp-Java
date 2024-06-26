package collections.generics;

import java.util.ArrayList;
import java.util.List;

public class BoxCollGenerics <T> {
    private List<T> objects = new ArrayList<>();

    public void addObject(T object) {
        objects.add(object);
    }

    public T getObject(int index) {
        return objects.get(index);
    }

    public List<T> getAllObjects() {
        return objects;
    }
}
