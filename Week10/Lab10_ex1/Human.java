package Lab10_ex1;

public final class Human extends Animal{

    public Human(String name){
        super(name);
    }

    void bear(){
        System.out.println("The Human "+name+ " was born");
    }

    void die(){
        System.out.println("The Human " +name+" has died");
    }
}
