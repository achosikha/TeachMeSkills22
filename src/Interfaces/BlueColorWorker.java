package Interfaces;

public class BlueColorWorker extends Employee{
    public BlueColorWorker(String employeeName, String company) {
        super(employeeName, company);
    }

    @Override
    public void setPosition() {
        // set any value including position
    }

    @Override
    public void getPosition() {
        System.out.println("This is an Blue Color Worker...");
    }

    @Override
    public void getAdditionalInfo() {
        System.out.println("This Class belongs to Blue Color Workers... " + super.getEmployeeName());
    }
}
