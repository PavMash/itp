package Ex2;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void Perimeter(){ }

    public void Area(){ }
}

class Pentagon extends Shape {
    private int side;

    public Pentagon(String name, int side) {
        super(name);
        this.side = side;
    }

    public void Perimeter(){
        System.out.println("Perimeter = " + side*5 );
    }

    public void Area(){
        System.out.println("Area = " + side*side);
    }
}