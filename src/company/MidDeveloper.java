package company;

public class MidDeveloper extends Employee{
    public  MidDeveloper(String id, String name, double salary) {
        super(id, name, salary);
    }
    public void work() {
        System.out.println("Mid Developer starts to working");
    }
}
