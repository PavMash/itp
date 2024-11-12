import java.util.Scanner;
import java.lang.Math;

public class Time{
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static void main(String[] args){
        Time start = new Time(12,15,55);
        Time end = new Time(12,15,55);
        Scanner sc = new Scanner(System.in);
        start.hours = sc.nextInt();
        start.minutes = sc.nextInt();
        start.seconds = sc.nextInt();
        end.hours = sc.nextInt();
        end.minutes = sc.nextInt();
        end.seconds = sc.nextInt();
        Time diff = new Time(12,15,55);

        diff.hours = Math.abs(start.hours-end.hours);
        diff.minutes = Math.abs(start.minutes-end.minutes);
        diff.seconds = Math.abs(start.seconds-end.seconds);
        System.out.println(diff.hours + " " + diff.minutes + " " + diff.seconds);
    }
}
