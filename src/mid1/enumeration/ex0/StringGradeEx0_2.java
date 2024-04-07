package mid1.enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("vip 등급의 할인 금액 = " + vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액 = " + diamondd);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 = " + diamondd);

        // 등급에 문자열을 사용하는 방시은 다음과 같은 문제가 있다.
        // 타입 안정성 부족 문제 : 문자열은 오타가 발생하기 쉽고, 유효하지 않은 값이 입력될 수 있다.
        // 데이터 일관성 문제 : 대문자(GOLD), 소문자(gold), 대소문자(Gold) 입력될 수 있다.
    }
}
