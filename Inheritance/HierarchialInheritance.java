class Shape {
    public void area(){
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {
    public void area(){
        System.out.println("This is Triangle");
    }
}

class Circle extends Shape{
    public void area(){
        System.out.println("This is Circle");
    }
}
public class HierarchialInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Circle c1 = new Circle();

        t1.area();
        c1.area();
    }
}
