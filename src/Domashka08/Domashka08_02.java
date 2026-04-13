package Domashka08;
/*
Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
 */
public class Domashka08_02 {
    public static void main(String[] args) {
        Animals animals = new Animals();
        System.out.println("Добавляем животных Cat Dog Parrot");
        animals.addAnimal("Cat");
        animals.addAnimal("Dog");
        animals.addAnimal("Parrot");
        System.out.println(animals);
        System.out.println("Убираем 1 животное в конце");
        animals.removeAnimal();
        System.out.println(animals);
        System.out.println("Убираем еще 1 животное в конце");
        animals.removeAnimal();
        System.out.println(animals);
        System.out.println("Убираем еще 1 животное в конце");
        animals.removeAnimal();
        System.out.println(animals);
        System.out.println("Пытаемя убрать еще одно животное в конце");
        animals.removeAnimal();
    }
}
