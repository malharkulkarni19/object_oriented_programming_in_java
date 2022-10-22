// Combine data and their functions in the entity, it is used for data hiding in java

class ATMInfo{
    public String name;
    public double mobNumber;
    public double accNumber;
}

public class EncapsulationEg {
    public static void main(String[] args) {
        ATMInfo person1 = new ATMInfo();

        person1.name = "Malhar";
        person1.accNumber = 1234588888;
        person1.mobNumber = 1234567890;

        System.out.println("The name of person1 is : " + person1.name);
    }
}