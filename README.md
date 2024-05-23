## 자바 공부 기록

### 공부환경
- IntelliJ IDEA Community Edition 2023.3.3
- Amazon Corretto 21

### mid1 목차
 1. Object 클래스
 2. 불변 객체
 3. String 클래스
 4. 래퍼, Class 클래스
 5. 열거형 - ENUM
 6. 날짜와 시간
 7. 중첩 클래스, 내부 클래스1
 8. 중첩 클래스, 내부 클래스2
 9. 예외 처리1 - 이론
 10. 예외 처리2 - 실습

### mid2 목차
1. 제네릭 - Generic1
2. 제네릭 - Generic2
3. 컬렉션 프레임워크 - ArrayList
4. 컬렉션 프레임워크 - LinkedList
5. 컬렉션 프레임워크 - List
6. 컬렉션 프레임워크 - 해시(Hash)
7. 컬렉션 프레임워크 - HashSet
8. 컬렉션 프레임워크 - Set
9. 컬렉션 프레임워크 - Map, Stack, Queue
10. 컬렉션 프레임워크 - 순회, 정렬, 전체 정리

- 순서가 중요하고 중복이 허용되는 경우 - List 인터페이스를 사용하자. ArrayList가 일반적인 선택이지만, 추가/삭제 작업이 앞쪽에서 빈번한 경우 LinkedList가 성능상 더 좋은 선택이다.
- 중복을 허용하지 않고 순서가 중요하지 않은 경우 - HashSet을 사용하자. 순서를 유지해야 하면 LinkedHashSet을, 정렬된 순서가 필요하면 TreeSet을 사용하자
- 요소를 키-값 쌍으로 저장하려는 경우 - Map 인터페이스를 사용하자. 순서가 중요하지 않다면 HashMap을, 순서를 유지해야한다면 LinkedHashMap을, 정렬된 순서가 필요하면 TreeMap을 사용하자
- 요소를 처리하기 전에 보관해야 하는 경우: Queue, Deque 인터페이스를 사용하자. 스택,큐 구조 모두 ArrayDeque를 사용하는 것이 가장 빠르다. 만약 우선순위에 따라 요소를 처리해야 한다면 PriorityQueue를 고려하자
