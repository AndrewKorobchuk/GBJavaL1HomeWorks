package lesson3;

import java.util.Arrays;

/**
 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 С помощью цикла и условия заменить 0 на 1, 1 на 0;

 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами
 Определить элементы одной из диагоналей можно по следующему принципу:
 индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
 и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
 если в массиве есть место, в котором сумма левой и правой части массива равны.
 **Примеры:
 checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
 checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

 граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

 8. *** Написать метод, которому на вход подается одномерный массив и
 число n (может быть положительным, или отрицательным),
 при этом метод должен сместить все элементы массива на n позиций.
 Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
 при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
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
