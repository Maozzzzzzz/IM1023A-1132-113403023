//Q1
package WEEK4;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //definate and input the array
        int[] number = new int[5];
        int vaild = 5;
        System.out.println("Please enter the grade of student 1");
        number[0] = input.nextInt();
        System.out.println("Please enter the grade of student 2");
        number[1] = input.nextInt();
        System.out.println("Please enter the grade of student 3");
        number[2] = input.nextInt();
        System.out.println("Please enter the grade of student 4");
        number[3] = input.nextInt();
        System.out.println("Please enter the grade of student 5");
        number[4] = input.nextInt();

        int sum = number[0]+number[1]+number[2]+number[3]+number[4];
        for(int i=0;i <5;i++){
            if(number[i]<=0){
                vaild--;
                sum = sum - number[i];
            }
        }
        System.out.println("the vaild number of student's grade:"+ vaild);
        //caculating the avg.
        float avg =(float)sum / vaild;
        System.out.println("the average number of student's grade:"+ avg );







    }
}
