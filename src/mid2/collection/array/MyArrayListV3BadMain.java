package mid2.collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numList = new MyArrayListV3();
        // 마지막에 추가
        numList.add(1);
        numList.add(2);
        numList.add("문자3");
        System.out.println(numList);

        //Object를 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer) numList.get(0);
        Integer num2 = (Integer) numList.get(1);

        // 예외발생
        Integer num3 = (Integer) numList.get(2);
    }
}
