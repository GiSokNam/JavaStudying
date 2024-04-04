package mid1.lang.immutable.address;

public class ImmutableAddress {
    // 불변 객체 도입 : 객체의 상태(객체 내부의 값, 필드, 멤버변수)가 변하지 않는 객체를 불변 객체(Immutable Object)라 한다.
    // 내부의 값이 변경 되면 안되기 때문에 final로 선언 -> final을 선언하는 이유는 혹시라도 setValue()를 만들었을 때 컴파일 오류가 발생하도록 하기 위함이다.
    // 값을 변경할 수 있는 setValue()는 선언하지 않는다.
    // 이 클래스는 생성자를 통해서만 값을 설정할 수 있고, 이후에는 값을 변경하는 것이 불가능하다.
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
