package mid2.collection.list.test.ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
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
        bw.write("출력");
        bw.newLine();
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) +"");
            if (i < list.size() - 1) {
                bw.write(", ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
