// Java 程式的基本架構&Input
import java.util.Scanner;  // 引入 Scanner 類別，來建立Input system

public class basic2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // 創建 Scanner 物件，在repositaries才可以獲取Tㄍhe information of input
        
        System.out.print("請輸入一個整數: ");
        int number = input.nextInt();  // 讀取使用者輸入的整數
        System.out.println("你輸入的數字是: " + number);

    /*
    nextInt():讀取 int 整數
    nextDouble():讀取 double 浮點數
    nextLine():讀取整行文字（包含空格）
    next():讀取一個單字（遇到空格或換行結束）
    nextBoolean():讀取 true 或 false
    */
    }
}