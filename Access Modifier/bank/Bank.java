package bank;

class Account{
    public String name;  // public means can access for all the classes.
    String email;        // default means it is by default.
    protected double phoneNumber;    // protected means access for all classes by the same package and for different package, the subclasses only.
    private int password;    // private means access for only same class only, use getters and setters

    public int getPassword(){
        return this.password;
    }

    public void setPassword(int pass){
        this.password = pass;
    }
}

public class Bank{
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Malhar";
        account1.email = "malharkulkarni19@gmail.com";
        account1.phoneNumber = 855202125;
        // account1.password = 123;      //throws error as it is private

        account1.setPassword(12345);
        System.out.println(account1.getPassword());
    }
}