public class ex1 {
    public double add(int a, int b) {
        return (double) a + b;
    }
    public double subtract(int a, int b) {
        return (double) a - b;
    }
    public double multiply(int a, int b) {
        return (double) a * b;
    }
    public double divide(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return (double) a / b;
    }
    public double calculate(int a, String operator, int b) {
        switch (operator) {
            case "+": return add(a, b);
            case "-": return subtract(a, b);
            case "*": return multiply(a, b);
            case "/": return divide(a, b);
            default: 
                System.out.println("Unknown operation");
                return -1;
        }

    }

    public static void main(String[] args) {
        if (args.length != 3) {
            return;
        }
        
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[3]);
        String operator = args[1];

        if (n1 < 0 || n2 < 0) {
            System.out.println("Programme takes only positive integers");
            return;
        }
        ex1 calculator = new ex1();
        double result = calculator.calculate(n1, operator, n2);
        System.out.println("Result: " + result);
        
    }
}