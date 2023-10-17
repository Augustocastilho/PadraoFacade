package org.example;

public class AnimalFacade {

    public static boolean verificarAnimaisNoZoo(Animal animal) {

        if(Aves.getInstancia().verificarAnimalNoZoo(animal))
            return true;
        if (Mamiferos.getInstancia().verificarAnimalNoZoo(animal))
            return true;
        if (Marinhos.getInstancia().verificarAnimalNoZoo(animal))
            return true;

        return false;
    }

}
