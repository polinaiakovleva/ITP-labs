public abstract class creature {
    String name = null;
    boolean isAlive = false;
    
    public abstract void bear();
    public abstract void die();

    public void shoutName() {
        if (name != null) {
            System.out.println(name);
        }
        else {
            System.out.println("Error");
        }
    }

}