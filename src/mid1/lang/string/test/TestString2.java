package mid1.lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
        for (String str : arr) {
            sum += str.length();
            System.out.println(str + ":" + str.length());
        }
        System.out.println("sum = " + sum);
    }
}
