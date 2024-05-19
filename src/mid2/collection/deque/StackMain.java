package mid2.collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);

        // Stack 클래스는 사용하지말자!
        // 자바의 Stack 클래스는 매부에서 Vector라는 자료 구조를 사용한다. 이 자료 구조는 자바 1.0에 개발되었는데,
        // 지금은 사용되지 않고 하휘호환을 위해 존재한다.
        // 지금은 더 빠른 좋은 자료구조가 많다. 따라서 Vector를 사용하는 Stack도 사용하지 않는 것을 권장한다.
        // 대신 Deque를 사용하는 것이 좋다.

    }
}
