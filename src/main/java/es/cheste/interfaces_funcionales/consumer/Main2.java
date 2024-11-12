package es.cheste.interfaces_funcionales.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main2 {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + " " + y);
        addTwo.accept(5,10);

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Nombre1");
        map.put(2,"Nombre2");
        map.put(3,"Nombre3");
        map.forEach((key, value) ->{
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        });
    }
}
