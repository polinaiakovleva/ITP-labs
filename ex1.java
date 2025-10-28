public class ex1 {
    public static void main(String[] args) {
        Animal[] animals = {
            new Cow("Buryonka", 1.5, 500, "black-white"),
            new Cat("Murzik", 0.3, 4, "gray"),
            new Dog("Rex", 0.7, 25, "brown")
        };

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.makeSound();
        }
    }
}