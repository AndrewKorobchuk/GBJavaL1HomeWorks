package lesson1;

/**
 * 1. Create the Printhreewords method, which, when calling, should print three words in the column:
 * Orange
 * Banana
 * Apple

 * 2. Create the Checksumsign method, in the body of which you declare two intents a and b,
 * And initialize them with any meanings that you want. Further, the method should smoke these variables,
 * And if their amount is more or equal to 0, then display the message “Positive amount” to the console,
 * otherwise - “the amount of negative”;

 * 3. Create the PRINTCOLOR method in whose body set the Value variable and initialize it with any value.
 * If Value is less than 0 (0 inclusive), then the “red” message should be displayed in the console,
 * if it lies in the range from 0 (0 exclusively) to 100 (100 inclusive),
 * then “yellow”, if more than 100 (100 exclusively) - “green”;

 * 4. Create the Comparenumbs method, in the body of which you declare two intents a and b,
 * And initialize them with any meanings that you want. If more or equal to B,
 * then it is necessary to display the message “a> = b” to the console, otherwise “a <b”;
 */
public class lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 10;
        int b = 5;
        int sum = a + b;
        if(sum>=0){
            System.out.println("Positive amount");
        } else {
            System.out.println("The amount is negative");
        }
    }

    public static void printColor(){
        int value = 999;
        if(value<=0){
            System.out.println("Red");
        }else if(value<=100){
            System.out.println("Yellow");
        }else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers(){
        int a = 10;
        int b = 5;
        if(a>=b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }
}
