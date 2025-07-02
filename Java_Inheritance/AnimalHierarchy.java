package Java_Inheritance;
class Animal {
    String name;
    int age;
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Tweet!");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Bird() };
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}