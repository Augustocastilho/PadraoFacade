package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Zoo {

    private List<Animal> animaisNoZoo = new ArrayList<>();

    public void addAnimalNaCategoria(Animal animal) { this.animaisNoZoo.add(animal); }

    public boolean verificarAnimalNoZoo(Animal animal) { return this.animaisNoZoo.contains(animal); }
}
