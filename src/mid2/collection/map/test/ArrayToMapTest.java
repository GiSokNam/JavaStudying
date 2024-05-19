package mid2.collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성
        Map<String, String> map = new HashMap<>();
        for (String[] strings : productArr) {
            map.put(strings[0], strings[1]);
        }

        // Map의 모든 데이터 출력
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("제품 = "+ entry.getKey() +", 가격 = "+ entry.getValue());
        }
    }
}
