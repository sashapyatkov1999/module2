package Homework1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<T> {
    private  T[] object;
    private final int size = 3;

    public MyList(Class<T[]> clazz) {
        object = clazz.cast(Array.newInstance(clazz.getComponentType(), size));
    }

    public static void main(String[] args) {
        MyList<Integer> foo = new MyList(Integer[].class);
        Integer[] bar = foo.object;
        foo.add(3);
        foo.add(2);
        foo.add(1);
        foo.add(2);
        System.out.println(foo);
    }


    public boolean add(Integer number) {
        boolean elementsNotNull = true;
        for (int i = 0; i < object.length; i++) {
            if (object[i] == null){
                elementsNotNull = false;
                break;
            }
        }
        if (elementsNotNull ){
//            Class<T>[] newArray = new Class[object.length*2];
//
//            for (int i = 0; i < object.length; i++) {
//                newArray[i] = (Class<T>) object[i];
//            }
        }
        for (int i = 0; i < object.length; i++) {
            if (object[i] == null) {
                object[i] = (T) number;
                break;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "object=" + Arrays.toString(object) +
                '}';
    }
}

