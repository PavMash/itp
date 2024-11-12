package Ex1;

public class Cow extends Animal{

    public Cow(String name, int height, int weight, String color){
        super(name, height, weight, color);
    }

    public void eat(String food){
        System.out.println("Your cow eaten " + food );
    }

    public void sleep() {
        System.out.println("Yor cow sleeps");
    }

    public void makeSound() {
        System.out.println("Moo");;
    }
}
