package es.cheste.interfaces_funcionales.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        // Clase anónima
        Consumer<String> printer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        printer.accept("Hola mundo");

        // Lambdas

        Consumer<String> printer2 = s -> System.out.println(s);
        Consumer<String> printer3 = s -> System.out.println(s);
        printer2.accept("Hola mundo Lambda");

       Consumer<String> printer23 = printer2.andThen(printer3);
       printer23.accept("Adios");

        List<String> nombres = new ArrayList<>();
        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");

        nombres.forEach(nombre -> System.out.println(nombre));
    }
}
