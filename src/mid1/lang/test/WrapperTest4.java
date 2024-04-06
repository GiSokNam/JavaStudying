package mid1.lang.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer integer1 = Integer.valueOf(str);

        // Integer -> int
//        int intValue = integer1.intValue();
        int intValue = integer1;

        // int -> Integer
//        Integer integer2 = Integer.valueOf(intValue);
        Integer integer2 = intValue;



        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);

    }
}
