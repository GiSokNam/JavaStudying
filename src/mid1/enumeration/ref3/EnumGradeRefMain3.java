package mid1.enumeration.ref3;


public class EnumGradeRefMain3 {
    public static void main(String[] args) {
        int price = 10000;
        System.out.println("basic = " + Grade.BASIC.discount(price));
        System.out.println("gold = " + Grade.GOLD.discount(price));
        System.out.println("diamond = " + Grade.DIAMOND.discount(price));
    }
}
