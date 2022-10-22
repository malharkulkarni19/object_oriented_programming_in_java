public class AreaOfCircle {
    private double radius = 2;
    public double getArea(){
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        AreaOfCircle myCircle = new AreaOfCircle();

        System.out.println("Radius is : " + myCircle.radius);
        System.out.println("Area of circle is : " + myCircle.getArea());
    }
}
