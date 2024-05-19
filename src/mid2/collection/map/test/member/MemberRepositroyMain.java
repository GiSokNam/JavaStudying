package mid2.collection.map.test.member;

public class MemberRepositroyMain {
    public static void main(String[] args) {
        Member member1 = new Member("id1", "회원1");
        Member member2 = new Member("id2", "회원2");
        Member member3 = new Member("id3", "회원3");

        // 회원 저장
        MemberRepositroy repositroy = new MemberRepositroy();
        repositroy.save(member1);
        repositroy.save(member2);
        repositroy.save(member3);

        // 회원 조회
        Member findMember1 = repositroy.findById("id1");
        System.out.println("findMember1 = " + findMember1);

        Member findMember3 = repositroy.findByName("회원3");
        System.out.println("findMember3 = " + findMember3);

        // 회원 삭제
        repositroy.remove("id1");
        Member removedMember1 = repositroy.findById("id1");
        System.out.println("removedMember1 = " + removedMember1);

    }
}
