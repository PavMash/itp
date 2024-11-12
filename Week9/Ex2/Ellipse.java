package Ex2;

public class Ellipse extends Shape{
    private double rad1, rad2;

    public Ellipse(String name, double rad1, double rad2) {
        super(name);
        this.rad1 = rad1;
        this.rad2 = rad2;
    }

    public void Perimeter(){
        double perimeter = 2*Math.PI * Math.sqrt((rad1*rad1 + rad2*rad2)/2);
        System.out.println("Perimeter is " + perimeter);
    }

    public void Area(){
        double area = Math.PI * rad1*rad1 * rad2*rad2;
        System.out.println("Area is " + area);
    }
}
