package Lab10_ex1;

public final class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    public void bear(){
        System.out.println("The Dog "+name+ " was born");
    }

    public void die(){
        System.out.println("The Dog " +name+" has died");
    }

    public void bark(){
        System.out.println("The Dog " +name+" has barked");
    }
}
