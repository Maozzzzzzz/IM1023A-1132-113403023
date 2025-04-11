package WEEK5;

public class test6 {
    public static void main(String[] args) {
        //define the array
        int[] arr = {8, 3, 5, 4, 9, 2};
        int n = 6;

        System.out.print("before sorting：");
        printArray(arr);

        //bubblesort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print("the " + (i + 1) + " times sorting：");
            printArray(arr);
        }

        System.out.print("after sorting：");
        printArray(arr);
    }

    // the funtion of print array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        }        
    }