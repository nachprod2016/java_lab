import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo(){
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal a){
        animals.add(a);
    }

    public void makeSounds(){
        for (Animal animal : animals){
            animal.makeSound();
        }
    }
}
