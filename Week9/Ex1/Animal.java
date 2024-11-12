package Ex1;

public class Animal {
   private String name;
   private int height;
   private int weight;
   private String color;

   public Animal(String name, int height, int weight, String color) {
       this.name = name;
       this.height = height;
       this.weight = weight;
       this.color = color;
   }

   public void eat(String food){
       System.out.println("No animal chosen");
   }

   public void sleep() {
       System.out.println("No animal chosen");
   }

    public void makeSound(  ) {
        System.out.println("No animal chosen");
    }
}

