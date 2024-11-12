package Ex2;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public void Perimeter() {
        double perimeter = 2 * radius * Math.PI;
        System.out.println("Perimeter is " + perimeter);
    }

    public void Area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area is " + area);
    }
}
