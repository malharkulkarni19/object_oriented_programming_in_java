class Car {
    String model;
    String color;

    public void CarProperties(){
        System.out.println("The model of car is " + this.model);
        System.out.println("The color of car is " + this.color);
    }
}

public class BasicClass {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Suzuki";
        car1.color = "Red";

        car1.CarProperties();
    }
}
