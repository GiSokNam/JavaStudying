package mid1.lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");

        // 래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - startTime) + "ms");

        // 래퍼 클래스가 기본형보다 속도 측면에서는 느리다.
        // 유지보수 vs 성능 최적화의 측면에서 볼 때, 코드를 어떻게 작성하는 것이 좋을까?
        // => 결론은 유지보수 측면을 고려해서 코드를 작성하는 것이 좋다.
        // 현대의 하드웨어의 발전으로 메모리상에서 발생하는 연산은 속도를 줄이는 것보다
        // 네트워크 호출이 더 많은 시간을 소모하기때문에 네트워크 호출 한번을 더 줄이는 것이 효과적이기 때문이다.
    }
}
