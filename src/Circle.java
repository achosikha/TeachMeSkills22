public class Circle extends Figures{
    public Circle(double radius){
        super(radius);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    private final double radius;


    public double getPerimeter() {

        return (2*3.14*getRadius());
    }
    public double getSquare() {
        return getRadius() * 3.14;
    }
    public String toString(){
        return "Circle: "+"\n" +
                "Radius is: "+ getRadius() + "\n"+
                "Perimeter is: " +getPerimeter()+"\n"+
                "Square is: "+getSquare()+"\n";}
}
