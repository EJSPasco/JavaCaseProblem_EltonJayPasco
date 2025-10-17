import java.util.Scanner;

class Calculate {
    Calculate(float x, float y, char operator) {
        switch (operator) {
            case '+':
                System.out.println("\n" + x + " " + operator + " " + y + " = "  + add(x, y));
                System.out.println("-------------------------------");
                break;
            case '-':
                System.out.println("\n" + x + " " + operator + " " + y + " = "  + subtract(x, y));
                System.out.println("-------------------------------");
                break;
            case '*':
                System.out.println("\n" + x + " " + operator + " " + y + " = "  + multiply(x, y));
                System.out.println("-------------------------------");
                break;
            case '/':
                if (y == 0) {
                    System.out.println("\nError: Cannot divide by zero!");
                    System.out.println("-------------------------------");
                } else {
                    System.out.println("\n" + x + " " + operator + " " + y + " = "  + divide(x, y));
                    System.out.println("-------------------------------");
                }
                break;
            default:
                System.out.println("\nInvalid operator.");
        }
    }

    float add(float x, float y) { 
        return x + y; 
    }

    float subtract(float x, float y) {
        return x - y; 
    }

    float multiply(float x, float y) { 
        return x * y; 
    }

    float divide(float x, float y) { 
        return x / y; 
    }
}

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        
        System.out.println("\n-------------------------------");
        System.out.println("Name: Elton Jay S. Pasco");
        System.out.println("ID #: 2024304336");
        System.out.println("-------------------------------");


        do {
            System.out.println("\n\n________CALCULATOR MENU________\n");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("\nChoose operation: ");
            option = scan.nextInt();

            if (option >= 1 && option <= 4) {
                System.out.print("\nEnter first number:  ");
                float x = scan.nextFloat();
                System.out.print("Enter second number: ");
                float y = scan.nextFloat();

                char operator = ' ';
                switch (option) {
                    case 1: operator = '+'; break;
                    case 2: operator = '-'; break;
                    case 3: operator = '*'; break;
                    case 4: operator = '/'; break;
                }

                new Calculate(x, y, operator);
            } else if (option != 0) {
                System.out.println("Invalid operation. \nPlease try again.");
            }

        } while (option != 0);

        System.out.println("\nExiting program. Goodbye!");
    }
}
