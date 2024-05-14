package mid2.collection.list.test.ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("n개의 정수를 입력하세요 (종료 0)");
        bw.newLine();
        bw.flush();
        List<Integer> list = new ArrayList<>();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            list.add(n);
        }
        int sum = 0;
        double average;
        for (Integer i : list) {
            sum += i;
        }
        average = (double) sum / list.size();

        bw.write("입력한  정수의 합계: " + sum);
        bw.newLine();
        bw.write("입력한  정수의 평균: " + average);
        br.close();
        bw.flush();
        bw.close();
    }
}
