package class16;

public class Person {
    String name="Suzy";
    String SSN="12345";
    private String password;
    static double bankBalance=12000;

    private void printPassword(){
        System.out.println(password);
    }
    private static void printBalance(){
        System.out.println(bankBalance);
    }

    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345";
        farwa.printPassword();
        System.out.println(Person.bankBalance);
        System.out.println(farwa.SSN);
        System.out.println(farwa.name);
    }
}
