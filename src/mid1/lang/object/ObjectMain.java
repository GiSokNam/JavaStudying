package mid1.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        // Child는 Parent를 상속 받고 있고 Parent는 묵시적으로 Object를 상속받기때문에 Object 클래스의 메서드를 사용할 수 있다.
        String string = child.toString();
        System.out.println("string = " + string);

        // 자바의 모든 객체의 최종 부모는 Object 이다.
        // Object는 모든 객체에 필요한 공통 기능을 제공한다.
        // 객체의 정보를 제공하는 toString()
        // 객체의 같음을 비교하는 equals()
        // 객체의 클래스 정보를 제공하는 getClass()
        // 기타 여러가지 기능

        // 부모는 자식을 담을 수 있다. Object는 모든 클래스의 부모 클래스이다. 따라서 모든 객체를 참조할 수 있다.
        // 모든 자바 객체는 Object 타입으로 처리될 수 있으며, 이는 다양한 타입의 객체를 통합적으로 처리할 수 있게 해준다.
    }
}
