public class SimpleCalculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0; 
        char operator = '/'; 

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero   is not allowed.");
                } else {
                System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                break;
 }
 }
}
