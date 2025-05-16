public class test7 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        modifyArray(arr);

        System.out.println("被修改後的陣列內容：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        double average = average(arr);
        System.out.println("平均值為：" + average  );
    }

    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] /= 10;
        }
    }

    public static double average(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum = sum+score;
        }
        return (double) sum / 5;
    }
}
