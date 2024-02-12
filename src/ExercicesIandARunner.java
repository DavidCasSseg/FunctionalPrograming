import abstrac.Animal;
import abstrac.Bird;
import clases.Aeroplane;
import clases.Cat;
import clases.Dog;
import interfaces.Flyable;

public class ExercicesIandARunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        Animal[] animals = {new Cat(), new Dog()};

        for(Flyable item : flyingObjects){
            item.fly();
        }
        System.out.println();

        for(Animal animal : animals){
            animal.bark();
        }
    }
}
