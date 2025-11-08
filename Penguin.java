public class Penguin implements swimmable, living {
    private boolean  isSwimming = false;

    @Override
    public void swim() {
        if (!isSwimming) {
            isSwimming = true;
            System.out.println("Penguin is swimming");
        }
        else {
            System.out.println("Penguin is swimming");
        }
    }

    @Override
    public void stopSwimming() {
        if (isSwimming) {
            isSwimming = false;
            System.out.println("Penguin is not swimming");
        }
        else {
            System.out.println("Penguin is not swimming");
        }
    }
    

}