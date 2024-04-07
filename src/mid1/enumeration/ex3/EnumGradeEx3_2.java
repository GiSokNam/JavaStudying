package mid1.enumeration.ex3;

public class EnumGradeEx3_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
//        Grade grade = new Grade(); // enum 생성 불가
//        int result = discountService.discount(grade, price);
//        System.out.println("newClassGrade 의 할인 금액: " + result);

        // enum은 열거형 내부에서 상수로 지정하는 것 외에 직접 생성이 불가능하다. 생성할 경우 컴파일 오류가 발생한다.
        // 열거형 사용하는 경우 static import를 적절하게 사용하면 더 읽기 좋은 코드를 작성할 수 있다.


    }
}
