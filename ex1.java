import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = 0;
        t = a;
        a = b;
        b = t;
        System.out.println(a + " " + b);
    }
}