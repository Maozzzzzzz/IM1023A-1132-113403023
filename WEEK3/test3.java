//Q1
package WEEK3;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt user to enter the numbers
        System.out.println("Please enter the positive interger");
        int number = input.nextInt();
        //check whether the input is positive interger
        while(number <= 0 ){
            System.out.println("Invaild Numbers,plz try again"); 
            System.out.println("Please enter the positive interger");
            number = input.nextInt();
        }
        //caculating the sum
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if( i % 3 == 0 || i % 5== 0){
                if(i % 7 == 0){
                    continue;
                }
                sum = sum + i;
            }
    
        }
        System.out.println("THE SUM IS:" + sum);

        
    }
}
