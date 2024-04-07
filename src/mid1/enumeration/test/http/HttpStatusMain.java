package mid1.enumeration.test.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HttpStatusMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("HTTP CODE: ");
        int httpCodeInput = Integer.parseInt(br.readLine());

        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        if (status == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(status.getCode()+ " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }


    }
}
