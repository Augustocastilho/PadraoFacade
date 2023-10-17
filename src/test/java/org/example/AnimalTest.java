package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void deveRetornarPossuiAnimalMarinho() {
        Animal animal = new Animal();
        Marinhos.getInstancia().addAnimalNaCategoria(animal);

        assertEquals(true, animal.verAnimaisNoZoo());
    }

    @Test
    void deveRetornarPossuiAnimalMamifero() {
        Animal animal = new Animal();
        Mamiferos.getInstancia().addAnimalNaCategoria(animal);

        assertEquals(true, animal.verAnimaisNoZoo());
    }

    @Test
    void deveRetornarPossuiAnimalAve() {
        Animal animal = new Animal();
        Aves.getInstancia().addAnimalNaCategoria(animal);

        assertEquals(true, animal.verAnimaisNoZoo());
    }

    @Test
    void deveRetornarNaoPossuiNoZoo() {
        Animal animal = new Animal();

        assertEquals(false, animal.verAnimaisNoZoo());
    }
}