import java.util.Scanner;

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static Time difference(Time start, Time end) {
        int start_sec = start.hours * 3600 + start.minutes * 60 + start.hours;
        int end_sec = end.hours * 3600 + end.minutes * 60 + end.hours;
        int dif = Math.abs(end_sec - start_sec);
        int hours = dif / 3600;
        int minutes = (dif % 3600) / 60;
        int seconds = dif % 60;

        return new Time(hours, minutes, seconds);
    }
}

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st period: ");
        Time p1 = inputTime(scanner, 1);
        Time p2 = inputTime(scanner, 2);

    }
}