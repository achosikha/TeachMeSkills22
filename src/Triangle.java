public class Triangle extends Figures {
    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public double getSideA() {

        return sideA;
    }

    public double getSideB() {

        return sideB;
    }

    public double getSideC() {

        return sideC;
    }

    public double getPerimeter() {
        return ((getSideA() + getSideB()) + getSideC());
    }

    public double getSquare() {
        return Math.sqrt(getPerimeter() * (getPerimeter() - sideA) * (getPerimeter() - sideB) *
                (getPerimeter() - sideC));
    }

    public String toString() {
        return "Triangle: " + "\n" +
                "SideA is: " + getSideA() + "\n" +
                "SideB is " + getSideB() + "\n" +
                "SideC is: " + getSideC() + "\n" +
                "Perimeter is: " + getPerimeter() + "\n" +
                "Square is: " + getSquare() + "\n";
    }
}

