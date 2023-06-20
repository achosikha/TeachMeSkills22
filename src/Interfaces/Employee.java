package Interfaces;

public abstract class Employee implements Position, Additional, NonObligatory {
    private String employeeName;
    private String company;

    public Employee(String employeeName, String company)
    {
        this.employeeName = employeeName;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee full name is: " + this.employeeName + "\n" +
                "Employee's Company is: " + this.company;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
