package Lab11_ex1;
import java.util.Scanner;

enum Drinks {
    Coke_Cola("Coke_Cola", 5),
    Sprite("Sprite", 7),
    Fanta("Fanta", 10);

    private final String name;
    private final int price;
    Drinks(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

}

enum Money {
    OneDollar(1),
    FiveDollar(5),
    TenDollar(10),
    TwentyDollar(20);

    private final int denomination;

    Money(int denomination){
    this.denomination = denomination;}

}




public class VendingMachine {
    Drinks drink;
    public void showMenu(){
        System.out.println("Here's the menu:");
        for (Drinks dr : Drinks.values()){
            System.out.println(dr.getName()+" "+dr.getPrice()+"\n");
        }
        System.out.println("Choose a drink, please\n");
    }

    public void chooseDrink(String name) {
        for (Drinks dr : Drinks.values()) {
            if (dr.getName().equals(name)) {
                System.out.println("Drink" + name + "was chosen." +
                        "Please, insert" + dr.getPrice() + "dollars\n");
                drink = dr;
            }
        }
    }


    }
}

