import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st line: ");
        String line1 = scanner.next();

        System.out.println("Enter 2nd line: ");
        String line2 = scanner.next();

        if (line1.length() != line2.length()) {
            System.out.println("Strings are NOT lexicographically equal");
            System.exit(0);
        }

        else {
            for (int i = 0; i < line1.length(); i++) {
                if (line1.charAt(i) != line1.charAt(i)) {
                System.out.println("Strings are not lexicographically equal");
                System.exit(0);
                }
            }

        }
        System.out.println("Strings are lexicographically equal");

    }
}