package class16;

public class HWTask3 {
    /* Create a method that will accept a String as a parameter
    and return a new String that consist only of vowels.
    Method should be available inside the class
    only where it was declared and executed by calling it its name
     */
    private String vowels(String s){
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        HWTask3 task3=new HWTask3();
        System.out.println(task3.vowels("Java all day"));
    }
}
