//Interfaces doesnt have constructors.

interface Animal{
    public void Walk();
}

class Horse implements Animal{      //interface has implement property, not extends
    public void Walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class InterfacesInAbstraction {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.Walk();
    }
}
