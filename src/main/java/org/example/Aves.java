package org.example;

public class Aves extends Zoo {

    private static Aves aves = new Aves();

    private Aves() {};

    public static Aves getInstancia() { return aves; }
}
