/* Constructors Properties :-
 1) Constructors has same name as class.
 2) Constructoes did't return anything, has invalid return type, eg:- int, float, char, String, and also void.
 3) For 1 constructors, there is only one constructor is callable, it can't return multiple times for same constructors.
 */

/*Types of contructors :-
 1) Non-parameteric constructors eg. Student() -- It has no parameters.
 2) Parametric Constructors eg. Student(String name, int age) -- It has parametrs like name and age.
 3) Copy Constructors eg. Copy constructor properties from other constructors and use it in current constructors.  eg -- this.name = s2.name
*/

class Pen{
    String color;
    String type;

    public void Write(){
        System.out.println("Writing something");
    }

    public void PenProperties(){
        System.out.println("The color of pen is " + this.color);
        System.out.println("The type of pen is " + this.type);
    }
}


//Non-parametric constructor
/*class Student {
    String name;
    int age;

    public void StudentInfo(){
        System.out.println("The name of student is " + this.name);
        System.out.println("The age of student is " + this.age);
    }
}*/

public class ConstructorsExample {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Parker Pen";
 
        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Gel Pen";

        pen1.PenProperties();
        pen2.PenProperties();

        /*Student student1 = new Student(); //Student() is called as constructors.
        student1.name  = "Malhar";
        student1.age = 22;

        student1.StudentInfo();*/
    }
}


//Parametric constructors

/*class Student1{
    String name1;
    int age1;

    Student1(String name1, int age1){
        this.name1 = name1;
        this.age1 = age1;
    }
    public void print(){
        System.out.println("The name of student is " + this.name1);
        System.out.println("The nage of student is " + this.age1);
    }
}

public class ConstructorsExample {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Malhar", 22);
        student1.print();
    }
}*/