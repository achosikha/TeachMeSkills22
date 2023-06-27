public abstract class Figures {
    double sideA;
    double sideB;
    double sideC;
    double radius;

    public Figures(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Figures(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public Figures(double radius){
        this.radius=radius;
    }

    public abstract double getSquare();
    public abstract double getPerimeter();
    public abstract String toString();

    public static double getPerimeterSum(Figures[] figures){
        double perimeterSum = 0;
        for (Figures figure : figures){
            perimeterSum += figure.getPerimeter();
        }
        return perimeterSum;
    }
}
