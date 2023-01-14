package lesson2;

/**
 * 1. Write a method that takes two integers to the input and checks that their amount lies in the range
 * from 10 to 20 (inclusive), if yes, return True, otherwise - false.
 *
 * 2. Write a method that is transmitted as a parameter as an integer,
 * the method should be printed in the console whether the number was transmitted or negative.
 Note: zero is considered a positive number.
 *
 * 3. Write a method to which an integer is transmitted as a parameter.
 * The method should return True if the number is negative, and return the FALSE if positive.
 *
 * 4. Write a method to which the line and number are transmitted as arguments,
 * the method must print the indicated number indicated number of times to the console;
 *
 * 5. * Write a method that determines whether the year is a leap year,
 * and returns Boolean (leaps -bosom - true, not a leap - false).
 * Every 4th year is a leap, except for every 100th, while every 400 is a leap.
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
            System.out.println("Passed a positive number");
        }else{
            System.out.println("Passed a negative number");
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
            System.out.println(year +" is lap year.");
        }
        else
        {
            System.out.println(year + " is not lap year.");
        }
    }
}
