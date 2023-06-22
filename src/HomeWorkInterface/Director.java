package HomeWorkInterface;

public class Director extends Employee{
    public Director(String employee, String position, String company) {
        super(employee, position, company);
    }

    @Override
    public void position() {
        System.out.println(super.getPosition());
    }

//    @Override
//    public String getGeneralInfo() {
//        super.getGeneralInfo();
//        System.out.println("After general info some information...");
//    }
}
