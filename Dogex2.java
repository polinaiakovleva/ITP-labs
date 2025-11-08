public final class Dogex2 extends creature {
    @Override
    public void bear() {
        this.name = "Bobik";
        this.isAlive = true;
        System.out.println("The dog " + name + " was born");
    }

    @Override
    public void die() {
        System.out.println("The dog " + name + " has died");
        this.isAlive = false;
    }

    public void bark() {
        System.out.println("Woof");
    }
}