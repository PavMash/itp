package Ex2;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void Perimeter() {
        System.out.println("Perimeter is " + 2*(width+height));
    }

    public void Area() {
        System.out.println("Area is " + width*height);
    }
}
