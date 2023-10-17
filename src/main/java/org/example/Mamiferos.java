package org.example;

public class Mamiferos extends Zoo{

    private static Mamiferos mamiferos = new Mamiferos();

    private Mamiferos() {};

    public static Mamiferos getInstancia() { return mamiferos; }
}
