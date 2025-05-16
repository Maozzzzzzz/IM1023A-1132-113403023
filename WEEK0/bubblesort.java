import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 讓使用者輸入陣列長度
        System.out.print("Enter the number of elements: ");
        int length = input.nextInt();

        int[] numbers = new int[length];

        // 輸入每個數字
        System.out.println("Enter " + length + " integers:");
        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        // 輸出排序前的陣列
        System.out.print("Before sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Bubble Sort
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // 交換
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // 輸出排序後的陣列
        System.out.print("After sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        input.close();

    }
}
