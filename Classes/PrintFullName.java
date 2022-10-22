class FullName {
    String fname;
    String mname;   //mname = middle name
    String lname;

    public void Name(){
        System.out.println("The full name of student is " + this.fname + " " + this.mname + " " + this.lname);
    }
}

public class PrintFullName{
    public static void main(String[] args) {
        FullName name = new FullName();
        name.fname = "Malhar";
        name.mname = "Manoj";
        name.lname = "Kulkarni";

        name.Name();
    }
}

