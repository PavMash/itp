package Ex1;

public class Dog extends Animal{
    public Dog(String name, int height, int weight, String color) {
        super(name, height, weight, color);
    }

    public void eat(String food) {
        System.out.println("Your dog eaten " + food);
    }

    public void sleep() {
        System.out.println("Your dog sleeps");
    }

    public void makeSound() {
        System.out.println("Bark");
    }
}
