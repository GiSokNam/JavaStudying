package mid1.lang.immutable.address;

public class PrimitiveMain {
    // 자바의 데이터 타입을 가장 크게 보면 기본형과 참조형으로 나눌 수 있다.
    // 기본형(Primitive Type) : 하나의 값을 여러 변수에서 절대로 공유하지 않는다.
    // 참조형(Reference Type) : 하나의 객체를 참조값을 통해 여러 변수에서 공유할 수 있다.
    public static void main(String[] args) {
        // 기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a; // a -> b, 값 복사 후 대입
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("20 - > b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
