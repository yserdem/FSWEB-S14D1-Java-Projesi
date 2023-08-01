package company;

public class JuniorDeveloper extends Employee{
    public  JuniorDeveloper(String id, String name, double salary) {
        super(id, name, salary);
    }
    public void work() {
        System.out.println("Junior Developer starts to working");
    }
}
