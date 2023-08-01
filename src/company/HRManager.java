package company;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    public HRManager(String id, String name, double salary, JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.seniorDevelopers = seniorDevelopers;
        this.midDevelopers = midDevelopers;
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working with");
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        if (juniorDevelopers[index] == null) juniorDevelopers[index] = developer;
        else System.out.println("there is already an employee assigned to this index");
    }
    public void addEmployee(int index, MidDeveloper developer) {
        if (midDevelopers[index] == null) midDevelopers[index] = developer;
        else System.out.println("there is already an employee assigned to this index");
    }
    public void addEmployee(int index, SeniorDeveloper developer) {
        if (seniorDevelopers[index] == null) seniorDevelopers[index] = developer;
        else System.out.println("there is already an employee assigned to this index");
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public void setJuniorDevelopers(JuniorDeveloper[] juniorDevelopers) {
        this.juniorDevelopers = juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public void setMidDevelopers(MidDeveloper[] midDevelopers) {
        this.midDevelopers = midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    public void setSeniorDevelopers(SeniorDeveloper[] seniorDevelopers) {
        this.seniorDevelopers = seniorDevelopers;
    }
}
