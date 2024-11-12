package Ex1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Pepe", 13, 2, "black");
        animal.makeSound();
        animal = new Cat("Pepe", 13, 2, "black");
        animal.makeSound();
        animal = new Dog("Pepe", 13, 2, "black");
        animal.sleep();
        animal = new Cow("Pepe", 13, 2, "black");
        animal.eat("grass");
    }
}
