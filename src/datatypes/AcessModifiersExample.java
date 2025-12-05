package datatypes;

public class AcessModifiersExample {
    public String name;
    private double salary;
    protected int age;
    String department;
}
class Example{
    public static void main(String[] args){
        AcessModifiersExample obj=new AcessModifiersExample();
        obj.name="John";
    }
}