package mid1.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        System.out.println("date = " + date);
        // 포멧팅: 날짜와 시간을 문자로
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = date.format(formatter);
        System.out.println("formattedDateTime = " + formattedDateTime);

        // 파싱 : 문자를 날짜와 시간으로
        String input = "2030-01-01 11:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(input, formatter);
        System.out.println("parsedDateTime = " + parsedDateTime);
    }
}
