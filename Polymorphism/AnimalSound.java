class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal{
    public void animalSound() {
        System.out.println("The Pig says: Wee Wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The Dog say: Bow Bow");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal pigSound = new Pig();
        Animal dogsound = new Dog();

        animal1.animalSound();
        pigSound.animalSound();
        dogsound.animalSound();
    }
}
