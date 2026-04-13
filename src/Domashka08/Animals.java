package Domashka08;

import java.util.LinkedList;

public class Animals {
    LinkedList<String> animals = new LinkedList<>();

    public void addAnimal(String animal) {
        animals.addFirst(animal);
        System.out.println(animals);
    }

    public void removeAnimal() {
        if (!animals.isEmpty()) {
            animals.removeLast();
        } else {
            System.out.println("список пуст");
        }
        System.out.println(animals);
    }
}
