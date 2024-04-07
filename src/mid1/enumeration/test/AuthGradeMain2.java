package mid1.enumeration.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AuthGradeMain2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        AuthGrade authGrade = AuthGrade.valueOf(br.readLine().toUpperCase());
        print(authGrade);
    }

    private static void print(AuthGrade authGrade) {
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
        System.out.println("==메뉴 목록==");
        System.out.println("- 메인 화면");
        if(authGrade.getLevel() > 1) System.out.println("- 이메일 관리 화면");
        if(authGrade.getLevel() > 2) System.out.println("- 관리자 화면");
    }


}
