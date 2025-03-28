
//Q2
package WEEK4;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //define 2D array
        System.out.println("Please enter the row of 2D array");
        int row = input.nextInt();
        System.out.println("Please enter the column of 2D array");
        int column = input.nextInt();
        int[][] number = new int[row][column];

        for (int i = 0; i < row; i++) {         
            for (int j = 0; j < column; j++) {  
                if(i==j){
                number[i][j]=1;
                System.out.print(number[i][j] + " ");
                }
                else{
                    number[i][j]=0;
                    System.out.print(number[i][j] + " ");
                }
            }
            System.out.println();
        }        
    }
}
