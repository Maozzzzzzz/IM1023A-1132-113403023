//Q2
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number
        System.out.println("Please enter number 1");
        float number1 = input.nextFloat();
        System.out.println("Please enter number 2");
        float number2 = input.nextFloat();
        
        input.nextLine();  

        // Prompt user to enter the choice of calculating
        System.out.println("Please choose which one that you wanna operate (+, -, *, /)");
        String choice = input.nextLine(); 

        // 定義 result 變數在 switch 之外
        float result = 0;

        switch(choice) {
            case "+":
                result = number1 + number2;
                System.out.println("The result of calculation: " + result);
                break;

            case "-":
                result = number1 - number2;
                System.out.println("The result of calculation: " + result);
                break;

            case "*":
                result = number1 * number2;
                System.out.println("The result of calculation: " + result);
                break;

            case "/":
                if (number2 != 0) {  
                    result = number1 / number2;
                    System.out.println("The result of calculation: " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid calculation operation, please try again.");
        }
    }
}
