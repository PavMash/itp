package Lab10_ex1;

public abstract class Creature {
    String name = null;
    boolean isAlive = false;

    Creature(String name){
        this.name = name;
    }

    abstract void bear();
    abstract void die();
    public void shoutName(){
        if (name != null) System.out.println(name);
        else System.out.println("Error, no name");
    }
}
