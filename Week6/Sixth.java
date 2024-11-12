import java.util.Scanner;

public class Sixth {

    private static int frToCl(int fr){
        int cl = (fr - 32)*5/9;
        return cl;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int forengeit = sc.nextInt();
        int celcius = frToCl(forengeit);
        System.out.println(celcius);
    }
}
