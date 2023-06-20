package Interfaces;

public class Director extends Employee{
    public Director(String employeeName, String company) {
        super(employeeName, company);
    }

    @Override
    public void setPosition() {
        // set any value including position
    }

    @Override
    public void getPosition() {
        System.out.println("This is a Director which is a White Color Worker...");
    }

    @Override
    public void getAdditionalInfo() {
        System.out.println("This Class belongs to Directors... " + super.getEmployeeName());
    }
}
