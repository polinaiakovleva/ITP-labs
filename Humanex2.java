public final class Humanex2 extends Animal {
    @Override
    public void bear() {
        this.name = "Jake";
        this.isAlive = true;
        System.out.println("The human " + name + " was born");
    }

    @Override
    public void die() {
        System.out.println("The human " + name + " has died");
        this.isAlive = false;
    }
}