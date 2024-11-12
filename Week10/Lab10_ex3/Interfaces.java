package Lab10_ex3;

public class Interfaces {
    public interface Swimmable{
        void swim();
        void stopSwimming();
    }

    public interface Flyable{
        void fly();
        void stopFlying();
    }

    public interface Living{
        default void live(){
            System.out.println(getClass() + " lives");
        };
    }
}
