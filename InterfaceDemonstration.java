import java.util.ArrayList;

public class InterfaceDemonstration {
    public static void main(String[] args) {
        Submarine submarine = new Submarine();
        submarine.swim();
        submarine.stopSwimming();
        System.out.println("");

        Duck duck = new Duck();
        duck.swim();
        duck.fly();
        duck.live();
        duck.stopFlying();
        duck.stopSwimming();
        System.out.println("");
        
        Penguin penguin = new Penguin();
        penguin.swim();
        penguin.live();
        penguin.stopSwimming();
        System.out.println("");


        ArrayList<living> livingBeings = new ArrayList<>();
        livingBeings.add(new Duck());
        livingBeings.add(new Penguin());

        for (living living : livingBeings) {
            living.live();
        }
    }
}