public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Welcome to the Scientific Calculator!");
        System.out.println("Enter your expression (or type 'exit' to quit):");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                double result = calculator.evaluate(input);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        scanner.close();
        System.out.println("Thank you for using the Scientific Calculator!");
    }
}