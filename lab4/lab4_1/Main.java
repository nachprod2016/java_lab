public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat", 1);
        Dog dog = new Dog("Dog", 1);
        Bird bird = new Bird("Bird", 1);
        Zoo z = new Zoo();
        z.addAnimal(cat);
        z.addAnimal(dog);
        z.addAnimal(bird);
        z.makeSounds();
    }
}