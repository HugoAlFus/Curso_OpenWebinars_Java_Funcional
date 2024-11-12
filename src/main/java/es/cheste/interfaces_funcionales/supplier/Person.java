package es.cheste.interfaces_funcionales.supplier;

public class Person {

    private String nombre;

    public Person() {
        super();
    }

    public Person(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
