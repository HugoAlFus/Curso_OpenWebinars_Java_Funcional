package es.cheste.interfaces_funcionales.predicate;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<String> validateName = name -> name.length() > 5 && name.length() < 15;

        System.out.println(validateName.test("Hugo")); // false
        System.out.println(validateName.test("OpenWebinars")); // true
        System.out.println(validateName.test("Supercalifagrilisticoespialidoso")); // false

        List<String> names = List.of("Hugo", "Juanito", "Manuel");
        for (String name : names) {
            if (validateName.test(name)) {
                System.out.println(name);
            }
        }
    }
}
