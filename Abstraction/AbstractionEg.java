// Combine data and their functions in the entity, it is used for data hiding in java
// abstract means existing only in idea, not a physical thing i.e. imaginary.

abstract class Animal{
    abstract void Walk();        // no need of curly braces, end with semicolon with decelration of abstratction.
    public void Eat(){
        System.out.println("Animal eats.....");
    }
}

class Horse extends Animal {
    public void Walk(){
        System.out.println("Horse walk on 4 legs");
    }
}

class Chicken extends Animal{
    public void Walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}

public class AbstractionEg {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.Walk();

        Chicken chicken1 = new Chicken();
        chicken1.Walk();
        chicken1.Eat();

    /*  Animal animal1 = new Animal();
        animal1.walk();  */     // Cause error because abstract class, and this is runtime error.
    }
}