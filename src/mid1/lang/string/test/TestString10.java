package mid1.lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] split = fruits.split(",");
        for (String string : split) {
            System.out.println(string);
        }

        String joinedString = String.join("->", split[0],split[1],split[2]);
        System.out.println("joinedString = " + joinedString);








    }
}
