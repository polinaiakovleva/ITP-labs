public class Animal {
    String name;
    double height;
    double weight;
    String color;

    public Animal(String name, double height, double weight, String color) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }
    public void eat() {
        System.out.println(name + " eats");
    }
    public void sleep() {
        System.out.println(name + " sleeps");
    }
    public void makeSound() {
        System.out.println(name + " makes sound");
    }

    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public String getColor() {
        return color;
    }

}