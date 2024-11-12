package Ex2;

public class Main {
    public static void main(String[] args) {
        Rectangle fig;
        fig = new Square("sq", 5);
        fig.Area();
        fig.Perimeter();

        Shape fig2 = new Pentagon("Pento", 12);
        fig2.Area();
        fig2.Perimeter();
    }
}
