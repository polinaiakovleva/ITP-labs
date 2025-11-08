public class Alien extends creature {
    @Override
    public void bear() {
        this.name = "X";
        this.isAlive = true;
        System.out.println("The alien " + name + " was born");
    }

    @Override
    public void die() {
        System.out.println("The alien " + name + " has died");
        this.isAlive = false;
    }
}