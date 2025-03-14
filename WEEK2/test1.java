//Q1

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the score(0-100)");
        int number = input.nextInt();
        
        if (number<0 || number>100){
            System.out.println("Invaild numbers,Please try again");
        }else if(number<=100 && number>=90){
            System.out.println("等級:A");
        }else if(number<=89 && number>=80){
            System.out.println("等級:B");
        }else if(number<=79 && number>=70){
            System.out.println("等級:C");
        }else if(number<=69 && number>=60){
            System.out.println("等級:D");
        }else if(number<=59){
            System.out.println("等級:F");
        }     
        }       
    }    
