public class Schoolinfo {
    private String Name;
    private String RollNo;
    private String Standard;
    private String Section;

    public Schoolinfo(){
        this("Default_name", "00", "First Year", "B");
    }
    
    public Schoolinfo(String name, String rollNo) {
        this(name, rollNo, "Second Year", "B");
    }

    public Schoolinfo(String name, String rollNo, String standard, String section) {
        Name = name;
        RollNo = rollNo;
        Standard = standard;
        Section = section;
    }
    public String getName() {
        return Name;
    }
    public String getRollNo() {
        return RollNo;
    }
    public String getStandard() {
        return Standard;
    }
    public String getSection() {
        return Section;
    }
    
    public static void main(String[] args) {
        Schoolinfo student1 = new Schoolinfo();
        Schoolinfo student2 = new Schoolinfo("Malhar", "BB53");
        Schoolinfo student3 = new Schoolinfo("Malhar", "TB53", "Final Year", "B");

        System.out.println(student1.getSection());
        System.out.println(student2.getRollNo());
        System.out.println(student3.getStandard());
        System.out.println(student3.getName());
    }
}
