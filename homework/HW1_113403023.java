public class HW1_113403023 {
    //the funtion of rotating array
    public static void rotate(int[][] array) {
        int lengthOfArray = array.length;

    //step 1: Transpose the matrix (Make array[i][j] become array[j][i])
    for (int i = 0; i < lengthOfArray; i++) {
        for (int j = i + 1; j < lengthOfArray; j++) {
            int temp = array[i][j];
            array[i][j] = array[j][i];
            array[j][i] = temp;//make it store temorarily
        }
    }

    //step 2: Reverse every row (swap left and right)
    for (int i = 0; i < lengthOfArray; i++) {
        for (int j = 0; j < lengthOfArray / 2; j++) {
            int temp = array[i][j];
            array[i][j] = array[i][lengthOfArray - 1 - j];
            array[i][lengthOfArray - 1 - j] = temp;
        }
    }
       
    }

    //the funtion of printing result
    public static void printMatrix(int[][] array) {
        //using nested loop to print every elements in array
        for (int i = 0; i < array.length; i++) {  //control row
            for (int j = 0; j < array[i].length; j++) {  // control column
                System.out.print(array[i][j] + " ");//print element
            }
            System.out.println();  // change to next column
        }
    }

    //main funtion
    public static void main(String[] args) {
        //define martix 1
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        //using rotate funtion
        rotate(matrix1);
        //using print funtion
        printMatrix(matrix1);

        System.out.println("--------------------------------");//dividing line

        int[][] matrix2 = {
            {15, 3, 19, 32, 1, 11},
            {22, 8, 27, 17, 26, 4},
            {10, 29, 20, 21, 6, 18},
            {5, 23, 28, 33, 9, 2},
            {24, 16, 30, 7, 14, 12},
            {13, 25, 31, 34, 36, 35}
        };
        //using rotate funtion
        rotate(matrix2);
        printMatrix(matrix2);

        System.out.println("--------------------------------");//deviding line

        int[][] matrix3 = {
            {76, 4, 55, 82, 24, 13, 64, 19, 43, 48},
            {42, 10, 87, 66, 3, 53, 27, 58, 45, 79},
            {92, 50, 98, 5, 20, 100, 11, 36, 60, 21},
            {90, 29, 15, 84, 23, 70, 77, 26, 96, 57},
            {89, 68, 41, 71, 34, 1, 54, 73, 2, 37},
            {97, 6, 44, 91, 75, 63, 14, 56, 62, 80},
            {46, 81, 85, 78, 18, 17, 52, 94, 31, 30},
            {86, 47, 67, 33, 9, 7, 22, 83, 74, 12},
            {32, 28, 65, 40, 39, 95, 61, 35, 88, 59},
            {25, 38, 72, 16, 93, 8, 69, 49, 51, 99}
        };
        //using rotate funtion
        rotate(matrix3);
        //using print funtion
        printMatrix(matrix3);         
        }
    }