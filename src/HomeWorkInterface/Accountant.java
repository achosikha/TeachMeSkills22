package HomeWorkInterface;

public class Accountant extends Employee{
    public Accountant(String employee, String position, String company) {
        super(employee, position, company);
    }

    @Override
    public void position() {
        System.out.println(super.getPosition());
    }
}
