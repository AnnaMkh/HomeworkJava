package constructors.classwork;

public class Intern extends Employee{

    double stipend;
    public Intern(String name, int employeeId, double stipend) {
        super(name, employeeId);
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }
}
