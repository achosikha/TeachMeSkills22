package HomeWorkInterface;

public abstract class Employee implements EmployeePosition{
    private String employee;
    private String position;
    private String company;

    public Employee(String employee, String position, String company)
    {
        this.employee = employee;
        this.position = position;
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void getGeneralInfo()
    {
        System.out.println("General info...");
    }
}
