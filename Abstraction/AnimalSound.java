abstract class Animal{
    public abstract void animalSound();

    public static void sleep(){
        System.out.println("z...z...");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says....");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal.sleep();

        Pig pig1 = new Pig();
        pig1.animalSound();

    }
}
