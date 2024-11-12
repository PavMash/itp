import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = new String(" ");

        System.out.println(s1.equals(s2) ? "True" : "False");
    }
}
