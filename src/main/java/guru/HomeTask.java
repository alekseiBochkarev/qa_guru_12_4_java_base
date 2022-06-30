package guru;

import java.util.Scanner;

public class HomeTask {

    public static String getType (Object object) {
        String type= ((Object)object).getClass().getSimpleName();
        return type;
    }


    public static void main(String[] args) {
        byte homeByte = 1;  //-128 to 127
        short homeShort = 5; //-32768 to 32767
        int homeInt = 2000; //2,147,483,648 to 2,147,483,647
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        long homeLong = 20000L;
        long maxLong = Long.MAX_VALUE;

        char myChar = 'f';
        System.out.println("myChar " + myChar);
        //try to overflow
        int result = maxInt + homeInt;
        System.out.println(result);
        int resultMin = minInt - homeInt;
        System.out.println(resultMin);
        long resultMultiPlyLong = homeLong * maxLong;
        System.out.println("resultMultiPlyLong" + resultMultiPlyLong);
        long resultAddLong = homeLong + maxLong;
        System.out.println("resultAddLong" + resultAddLong);
        int resultAfterLongCast = (int) (homeLong * maxLong);
        System.out.println("resultAfterLongCast" + resultAfterLongCast);

        float myFloat = 5.99f;       // Floating point number 6 to 7 decimal digits
        double myDouble = 5.9999;    // 15 decimal digits
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        System.out.println(myText);
        System.out.println("myByte type is " + getType(homeByte));
        System.out.println("myInt type is " + getType(homeInt));
        System.out.println("myLong type is " + getType(homeLong));
        System.out.println("myFloat type is " + getType(myFloat));
        System.out.println("myDouble type is " + getType(myDouble));

        int first, second, third;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first int: ");
        first = scanner.nextInt();
        System.out.println("enter secont int: ");
        second = scanner.nextInt();
        System.out.println("enter third int: ");
        third = scanner.nextInt();
        System.out.println("sum = " + (first + second + third));
        System.out.println("difference = " + (first - second - third) );
        System.out.println("multiplication = " + (first * second * third));
        System.out.println("quotient = " + (first / second / third));
        System.out.println("modulo = " + (first % second % third));
        System.out.println("max = " + Integer.max(first, Integer.max(second, third)));
        System.out.println("min = " + Integer.min(first, Integer.min(second, third)));
        System.out.println("first > second = " + (first > second));
        System.out.println("second <= third = " + (second <= third));
        System.out.println("first > second OR second > third = " + (first>second | second>third));
        System.out.println("first > second AND second > third = " + (first>second & second>third));
        if((Integer)first != null && first>second ) {
            System.out.println("youhooooo");
        }
        System.out.println("baretefsfsa is String = " + ("baretefsfsa" instanceof String));
        System.out.println(first > second ? "Dima" : "Alex");
    }
}
