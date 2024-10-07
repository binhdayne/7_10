import java.util.List;

public class Animal {
    private boolean canWalk;
    private String name;
    private boolean canSwim;

    public Animal(boolean canWalk, String name, boolean canSwim) {
        this.canWalk = canWalk = false;
        this.name = name;
        this.canSwim = canSwim = false;
    }

    public boolean isCanWalk() {
        return canWalk;
    }

    public String getName() {
        return name;
    }

    public boolean isCanSwim() {
        return canSwim;
    }
}

class Pig extends Animal {

    public Pig() {
        super(true,"Pig",false);
    }
}
class Duck extends Animal {

    public Duck() {
        super(true,"Pig",true);
    }
}
class Fish extends Animal {

    public Fish() {
        super(false,"Pig",true);
    }
}

class Farm {
    Animal[] animals = new Animal[100];
    int animalsNums = 0;
    

    public void addAnimal(Animal newAnimal) {
        animals[animalsNums] = newAnimal;
        animalsNums++;
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            if (animal.isCanSwim() || animal.isCanWalk()) {
                System.out.println(animal.getName() + " ");
            }
        }
    }
}



