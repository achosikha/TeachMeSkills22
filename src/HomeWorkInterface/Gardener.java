package HomeWorkInterface;

public class Gardener extends Employee{
    public Gardener(String employee, String position, String company) {
        super(employee, position, company);
    }

    @Override
    public void position() {
        System.out.println(super.getPosition());
    }
}
