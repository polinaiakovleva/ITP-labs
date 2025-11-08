public class Duck implements swimmable, flyable, living {
    private boolean  isSwimming = false;
    private boolean isFlying = false;

    @Override
    public void swim() {
        if (!isSwimming) {
            isSwimming = true;
            System.out.println("Duck is swimming");
        }
        else {
            System.out.println("Duck is swimming");
        }
    }

    @Override
    public void stopSwimming() {
        if (isSwimming) {
            isSwimming = false;
            System.out.println("Duck is not swimming");
        }
        else {
            System.out.println("Duck is not swimming");
        }
    }

    @Override
    public void fly() {
        if (!isFlying) {
            isFlying = true;
            System.out.println("Duck is flying");
        }
        else {
            System.out.println("Duck is flying");
        }
    }

    @Override
    public void stopFlying() {
        if (isFlying) {
            isFlying = false;
            System.out.println("Duck is not flying");
        }
        else {
            System.out.println("Duck is not flying");
        }
    }
    

}