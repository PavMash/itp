import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = "+ a + " and b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+ a + " and b = " + b);
    }
}