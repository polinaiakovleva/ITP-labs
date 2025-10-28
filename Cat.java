public class Cat extends Animal {
    public Cat(String name, double height, double weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says meow");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats mice");
    }

}