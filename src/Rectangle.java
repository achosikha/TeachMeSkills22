public class Rectangle extends Figures {
    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
        this.sideA=sideA;
        this.sideB=sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
    private final double sideA;
    private final double sideB;
    public double getPerimeter() {

        return ((getSideA() + getSideB()) * 2);
    }
    public double getSquare() {
        return getSideA() * getSideB();
    }
    public String toString(){
        return "Rectangle: "+"\n" +
                "SideA is: "+ getSideA() + "\n"+
                "SideB is "+ getSideB()+ "\n"+
                "Perimeter is: " +getPerimeter()+"\n"+
                "Square is: "+getSquare()+"\n";
    }
}
