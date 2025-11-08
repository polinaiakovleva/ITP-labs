
import java.util.ArrayList; 
public class AbstractClassDemonstration {
    public static void main(String[] args) {
        ArrayList<creature> creatures = new ArrayList<>();

        creatures.add(new Human());
        creatures.add(new Dog());
        creatures.add(new Alien());

        for (creature creature : creatures) {
            creature.bear();
            creature.shoutName();
            creature.die();
            System.out.println("");
        }

        creature dog = new Dog();
        if (dog instanceof Dog) {
            ((Dog) dog).bark();
        }
    }

}