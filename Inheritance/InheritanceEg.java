// Inheritance :- Pass from one generation to another generation, class will try to take property from other class
// Types of Inheritance
// 1) Single level Inheritance
// 2) Multi level Inheritance
// 3) Hierarchial Inheritance
// 4) Hybrid Inheritance
// 5) Multiple Inheritance (Not found in java in form of classes, but found in cpp.) Can be used by Interface in java, causes diamond problem.


//This is base class / parent class
class Shape {       
    String color;
}

class Triange extends Shape {
    //Extends means takes the value fro parent class i.e. Shape.
}


//This is sub class / child class
public class InheritanceEg {
    public static void main(String[] args) {
        Triange t1 = new Triange();

        t1.color = "Red";
        System.out.println(t1.color);
    }
}
