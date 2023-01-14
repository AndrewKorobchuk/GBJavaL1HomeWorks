package lesson2;

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 *
 * 2. Написать метод, которому в качестве параметра передается целое число,
 * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
 * Замечание: ноль считаем положительным числом.
 *
 * 3. Написать метод, которому в качестве параметра передается целое число.
 * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 *
 * 4. Написать метод, которому в качестве аргументов передается строка и число,
 * метод должен отпечатать в консоль указанную строку, указанное количество раз;
 *
 * 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
 * не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class lesson2 {
    public static void main(String[] args) {
        System.out.println(between10_20(5,8));
        positiveOrNegative(5);
        System.out.println(positive(5));
        repeat("Repeat",5);
        leapYear(2100);
    }

    public static boolean between10_20(int a, int b){
        if(a+b>=10&&a+b<=20){
            return true;
        }else{
            return false;
        }
    }

    public static void positiveOrNegative(int a){
        if(positive(a)){
            System.out.println("Передали положительное число");
        }else{
            System.out.println("Передали отрицательное число");
        }
    }

    public static boolean positive(int a){
        return a>=0;
    }

    public static void repeat(String s, int r){
        for(int i=0;i<r;i++){
            System.out.println(s);
        }
    }

    public static void leapYear(int year){
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
            System.out.println(year +" - високосный год.");
        }
        else
        {
            System.out.println(year + " - не високосный год.");
        }
    }
}
