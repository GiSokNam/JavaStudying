package mid1.lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.equals(user2)));

        // 동일성(identity) : 객체의 참조가 같아야 true.
        // 동등성(equals) : 서로 객체는 다르지만 둘다 같은 id(고객번호)를 가지고 있으면 논리적을 동등하여 true 반환
    }
}
