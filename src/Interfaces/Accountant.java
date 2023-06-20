package Interfaces;

public class Accountant extends Employee {
    public Accountant(String employeeName, String company) {
        super(employeeName, company);
    }

    @Override
    public void setPosition() {
        // set any value including position
    }

    @Override
    public void getPosition() {
        System.out.println("This is an Account which is a White Color Worker...");
    }

    @Override
    public void getAdditionalInfo() {
        System.out.println("This Class belongs to Accountants... " + super.getEmployeeName());
    }

    @Override
    public void defaultMethod() {
        System.out.println("NonObligatory Interface defaultMethod changed...");
    }
}
