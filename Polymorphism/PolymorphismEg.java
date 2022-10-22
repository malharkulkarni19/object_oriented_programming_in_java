//Poly :- Many
//Morphism :- Forms
//polymorphism :- One work done in many ways in java called Polymorphism

//It has two types
// 1) Function Overloading :- Compile type Ploymorphism -- Has same function names but do different operations
// 2) Function Overriding :- Runtime Polymorphism


//This is example of function overloading.

class StudentInfo{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println("Name :- " + name);
    }

    public void printInfo(int age){
        System.out.println("Age :- " + age);
    }

    public void printInfo(String name, int age){
        System.out.println("The age of " + name + " is " + age);
    }
}

public class PolymorphismEg{
    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo();

        student1.name = "Malhar";
        student1.age = 22;

        student1.printInfo(student1.name);
        student1.printInfo(student1.age);
        student1.printInfo(student1.name , student1.age);
    }
}
