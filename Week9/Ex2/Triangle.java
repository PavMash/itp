package Ex2;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public void Perimeter() {
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter is " + perimeter);
    }

    @Override
    public void Area() {
        double hp =  (side1 + side2 + side3)/2;
        double area = Math.sqrt(hp*(hp-side1)*(hp-side2)*(hp-side3));
        System.out.println("Area is " + area);
    }
}
