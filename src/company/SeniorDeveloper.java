package company;

public class SeniorDeveloper extends Employee{
    public  SeniorDeveloper(String id, String name, double salary) {
        super(id, name, salary);
    }
    public void work() {
        System.out.println("Senior Developer starts to working");
    }
}
