package Lab10_ex1;

public class Main {
    public static void main(String[] args) {
        Creature[] creatures = new Creature[3] ;

        creatures[0] = new Human("Brad");
        creatures[1] = new Dog("Bobik");
        creatures[2] = new Alien("Uo");

        for (Creature c : creatures) {
            c.bear();
            c.shoutName();
        }

        ((Dog)creatures[1]).bark();

        for (Creature c : creatures) {
            c.die();
        }
    }
}
