package Lab10_ex1;

public class Alien extends Creature{

    public Alien(String name){
        super(name);
    }

    void bear(){
        System.out.println("The Alien "+name+ " was born");
    }

    void die(){
        System.out.println("The Alien " +name+" has died");
    }
}
