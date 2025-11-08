public class Submarine implements swimmable {
    private boolean  isSwimming = false;

    @Override
    public void swim() {
        if (!isSwimming) {
            isSwimming = true;
            System.out.println("Submarine is swimming");
        }
        else {
            System.out.println("Submarine is swimming");
        }
    }

    @Override
    public void stopSwimming() {
        if (isSwimming) {
            isSwimming = false;
            System.out.println("Submarine is not swimming");
        }
        else {
            System.out.println("Submarine is not swimming");
        }
    }

}