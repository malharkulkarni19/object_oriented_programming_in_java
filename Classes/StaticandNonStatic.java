public class StaticandNonStatic{

    public static void test1(){
        System.out.println("This is static method");
    }

    public void test2(){
        System.out.println("This is non-static method");
    }
    public static void main(String[] args) {
        test1();  // For static method, no need to create new object.

        StaticandNonStatic test2 = new StaticandNonStatic();
        test2.test2();   // For non-static method, you need to create new object and then run it.
    }
}