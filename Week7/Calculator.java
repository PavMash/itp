package src;
import java.util.Scanner;

public class Calculator {
    public static void printOperations(){
        System.out.println("Please choose an operation from the given");
        for (Operation operation : Operation.values()) {
            System.out.format("%d. %s%n", operation.ordinal()+1, operation.getOp());
        }
    }

    public static void calculate(){
        Scanner sc = new Scanner(System.in);
        Operation op = getOperation(sc);
        int first = readNumber(sc);
        int second = readNumber(sc);
        int ans;
        switch (op) {
            case ADD:
                ans = first + second;
                break;
            case SUB:
                ans = first - second;
                break;
            case MUL:
                ans = first * second;
                break;
            case DIV:
                if (second != 0) {
                    ans = first / second;
                    break;
                } else {
                    System.out.println("NO");
                    ans = 0;
                    System.exit(1);
                }
            default:
                System.out.println("You messed up");
                ans = 0;
        }
        System.out.println(ans);
    }

    public static Operation getOperation(Scanner sc){
        int op = sc.nextInt();
        return Operation.values()[op-1];
    }

    public static int readNumber(Scanner sc){
        int num = sc.nextInt();
        return num;
    }

    public static void main(String[] args) {
        printOperations();
        calculate();
    }
}
