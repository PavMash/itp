package Lab10_ex3;

public class Submarine implements Interfaces.Swimmable {
    boolean isSwimming = false;
    public void swim(){
        System.out.println("Submarine is swimming");
        isSwimming = true;
    }

    public void stopSwimming() {
        if (isSwimming) System.out.println("Submarine stopped swimming");
        else System.out.println("Submarine is not swimming");
    }

}

