package mid1.lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // b.setValue("부산"); // 컴파일 오류
        // b의 값을 바꿀 수 있는 메서드를 찾는데, 불변 객체인 것을 확인한다.
        b = new ImmutableAddress("부산"); // 불변 객체이므로 새로운 객체를 생성
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // 참조형 변수는 참조값을 통해 같은 객체(인스턴스)를 공유하고 있다.
        // 기존의 Address 는 가변클래스이다.


    }
}
