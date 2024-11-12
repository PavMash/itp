package Ex1;

public class Cat extends Animal{

    public Cat(String name, int height, int weight, String color) {
        super(name, height, weight, color);
    }

    public void eat(String food) {
        System.out.println(" Your cat eaten " + food);
    }

    public void sleep() {
        System.out.println(" Your cat sleeps");
    }

    public void makeSound() {
        System.out.println("Meow");
    }
}
