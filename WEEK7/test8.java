package WEEK7;
public class test8 {

    public static int binarySearch(int[] arr, int target, int left, int right) {
        // closing funtion when we cant find the value
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid; 
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1); // toward left
        } else {
            return binarySearch(arr, target, mid + 1, right); // toward right
        }
    }

    // question
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9, 11, 13};
        int[] array2 = {2, 4, 6, 8, 10};
        System.out.println("target=7");
        System.out.println("result1:" + binarySearch(array1,7, 0, 6)); 
        System.out.println("target=5");
        System.out.println("result2:" + binarySearch(array2, 5, 0, 4));  
    }
}
