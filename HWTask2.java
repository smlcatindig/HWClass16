package class16;

public class HWTask2 {
    /* Create a method that will take a String as a parameter
    and returns reversed String. Method should be available to all
    classes within your project and accessible by class name.
     */

    public String reverseString (String s){
    StringBuilder sb=new StringBuilder(s).reverse();
    return sb.toString();

    }

    public static void main(String[] args) {
        HWTask2 sb=new HWTask2();
        System.out.println(sb.reverseString("All day Java"));
    }
}
