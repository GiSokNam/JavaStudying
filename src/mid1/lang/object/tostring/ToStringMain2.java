package mid1.lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());


        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);


        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String hexString = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("hexString = " + hexString);
        String hexString2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("hexString = " + hexString2);


        // Object OCP(개방폐쇄의원칙)
        // OPEN : 오버라이딩해서 기능을 확장할 수 잇다.
        // CLOSE : 새로운 클래스를 추가해도 Object와 toString()을 사용하는 클라이언트 코드인 ObjectPrinter는 변경하지 않아도 된다.
    }
}
