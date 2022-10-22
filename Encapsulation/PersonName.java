class Person{
    private String name;

    //getter

    public String getName(){
        return name;
    }

    //setter

    public void setName(String newName){
        this.name = newName;
    }
}

public class PersonName {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Malhar");
        System.out.println("The name of person is : " + person1.getName());
    }
}
