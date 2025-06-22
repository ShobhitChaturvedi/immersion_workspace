package Day2;

    import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first int: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second int: ");
        int num2 = scanner.nextInt();

        System.out.print("(+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if(num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }else{
                    result = num1 / num2;
                    System.out.println("Result: " + result);   
                    break;
}
               
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        scanner.close();
    }
}
