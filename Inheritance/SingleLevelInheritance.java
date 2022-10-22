class Shape {
    public void area(){
        System.out.println("Display area");
    }
}

class Traingle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Shape s1 = new Shape();

        s1.area();
    }
}
