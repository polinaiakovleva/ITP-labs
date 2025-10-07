import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value: ");
        double f = scanner.nextDouble();
        double c = (f - 32) * (5.0 / 9.0);
        System.out.println(f+"°F is " + c + "°C");

    }
}