package Lab10_ex3;

public class Duck implements Interfaces.Swimmable, Interfaces.Flyable, Interfaces.Living {
    boolean isSwimming = false;
    boolean isFlying = false;

    public void swim(){
        System.out.println("Duck is swimming");
        isSwimming = true;
    }
    public void stopSwimming() {
        if (isSwimming) System.out.println("Duck stopped swimming");
        else System.out.println("Duck is not swimming");
    }

    public void fly(){
        System.out.println("Duck is flying");
        isFlying = true;
    }



    public void stopFlying() {
        if (isFlying) System.out.println("Duck stopped flying");
        else System.out.println("Duck is not flying");
    }

    public void live(){}

}
