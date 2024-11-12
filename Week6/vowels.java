import java.util.Scanner;

public class vowels{

private static final char[] vowels = "aeiouyAEIOUY".toCharArray();

private static int vowelCount(char[] str){
    int count = 0;
    for (int i = 0; i < str.length; i++) {
        for (int j = 0; j < vowels.length; j++) {
            if (str[i] == vowels[j]) count += 1;
        }
    }
    return count;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.nextLine().toCharArray();
        int result = vowelCount(s1);
        System.out.println(result);
    }
}
