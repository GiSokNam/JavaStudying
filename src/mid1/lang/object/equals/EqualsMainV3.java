package mid1.lang.object.equals;

public class EqualsMainV3 {
    public static void main(String[] args) {
        UserV3 user1 = new UserV3("id-100");
        UserV3 user2 = new UserV3("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.getId().equals(user2.getId())));
        

    }
}
