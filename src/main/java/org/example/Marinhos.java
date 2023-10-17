package org.example;

public class Marinhos extends Zoo{

    private static Marinhos marinhos = new Marinhos();

    private Marinhos() {};

    public static Marinhos getInstancia() { return marinhos; }
}
