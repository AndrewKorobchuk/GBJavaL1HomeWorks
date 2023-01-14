package lesson3;

import java.util.Arrays;
/**
 /**
 1. Set an integer array consisting of elements 0 and 1. For example: [1, 1, 0, 1, 0, 1, 1, 0, 0].
 Using the cycle and the conditions replace 0 by 1, 1 by 0;

 2. Set the empty integrity of 100 lengths. Using the cycle, fill it with values of 1 2 3 4 5 6 7 8 ... 100;

 3. Set an array [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] to go through it in a cycle,
 and the numbers smaller 6 multiply by 2;

 4. Create a square two-dimensional integer array (the number of lines and columns is the same),
 and with the help of the cycle (s) fill its diagonal elements with units
 The elements of one of the diagonals can be determined by the following principle:
 the indices of such elements are equal, that is, [0] [0], [1] [1], [2] [2], ..., [n] [n];

 5. Write a method that accepts two arguments to the input: Len and Initialvalue,
 and returning a one -dimensional array of the LEN length type, each cell of which is equal to initialvalue;

 6. * Set one -dimensional array and find the minimum and maximum elements in it;

 7. ** Write a method into which the one -dimensional integer array is not empty,
 the method should return True if the massif has a place in which the sum of the left and right part of the array is equal.
 ** Examples:
 CheckBalance ([2, 2, 2, 1, 2, 2, 2, ||| 10, 1]) → True, i.e. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
 CheckBalance ([1, 1, 1, ||| 2, 1]) → True, i.e. 1 + 1 + 1 = 2 + 1

 The border is shown by symbols |||, these symbols are not included in the array and have nothing to do with or.

 8. *** Write a method to which one -dimensional array and number n (may be positive or negative) are submitted
 to the input, while the method must shift all the elements of the array to the n positions.
 Elements are shifted cyclically. To complicate the task, it is impossible to use auxiliary arrays.
 Examples: [1, 2, 3] at n = 1 (per one to the right) -> [3, 1, 2]; [3, 5, 6, 1]
 with n = -2 (on two to the left) -> [6, 1, 3, 5]. At which n in which direction the shift can be chosen yourself.
 */

public class lesson3 {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        array01();

        System.out.println("Задание 2");
        array1_100();

        System.out.println("Задание 3");
        array1_2();

        System.out.println("Задание 4");
        int[][] arr = new int[5][5];
        diagonal(arr);

        System.out.println("Задание 5");
        int arr2[] = initArray(5,8);
        printArray(arr2);

        System.out.println("Задание 6");
        minMax();

        System.out.println("Задание 7");
        int arr3[] = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean result = checkBalance(arr3);
        System.out.println(result);

        int arr4[] = {1, 1, 1, 2, 1};
        result = checkBalance(arr4);
        System.out.println(result);

        int arr5[] = {1, 1, 1, 8, 1};
        result = checkBalance(arr5);
        System.out.println(result);

        System.out.println("Задание 8");
        int arr6[] = {1, 2, 3, 4, 5};
        arrayOffset(arr6,3);
        printArray(arr6);

        int arr7[] = {1, 2, 3, 4, 5};
        arrayOffset(arr7,-3);
        printArray(arr7);
    }

    public static void array01(){
        int arr01[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i] == 0) {
                arr01[i] = 1;
            } else {
                arr01[i] = 0;
            }
        }
        printArray(arr01);
    }

    public static void array1_100(){
        int arr[] = new int[100];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = i + 1;
        }
        printArray(arr);
    }

    public static void array1_2() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<6){
                arr[i] = arr[i] * 2;
            }
        }
        printArray(arr);
    }

    public static void diagonal(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length-i-1]=1;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            printArray(arr[i]);
        }
    }

    public static int[] initArray(int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < len ; i++) {
            arr[i]=initialValue;
        }
        return arr;
    }

    public static void minMax(){
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] temp = arr.clone();
        Arrays.sort(temp);
        System.out.println("Минимальное значение: " + temp[0] + "; Максимальное значение: " + temp[temp.length-1]);
        temp = null;
    }

    public static boolean checkBalance(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        int sum_begin = arr[0];
        int sum_end = arr[arr.length-1];
        boolean result = false;
        while (true){
            if(sum_begin == sum_end && (i==j-1)){
                result = true;
                break;
            }

            if(sum_begin>sum_end){
                j = j - 1;
            }else{
                i = i + 1;
            }
            if(i>=j){
                break;
            }
            if(sum_begin>sum_end) {
                sum_end = sum_end + arr[j];
            }else {
                sum_begin = sum_begin + arr[i];
            }
        }

        return result;
    }

    public static void arrayOffset(int[] arr, int n){
        int temp;
        for (int i = 0; i < Math.abs(n); i++) {
            if(n>=0) {
                temp = arr[arr.length - 1];
                for (int j = arr.length-1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = temp;
            }else{
                temp = arr[0];
                for (int j = 0; j <arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=temp;
            }

            //System.out.println(arr);
        }
    }
}
