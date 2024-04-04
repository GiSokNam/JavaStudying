package mid1.lang.immutable.test;
// 아래의 클래스를 불변 클래스로 변경해라!
public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 불변 객체에서 값을 변경하는 경우 withXxx() 처럼 with로 시작하는 경우가 많다.
    // 정리하자면 with는 관례처럼 사용되는데, 원본 객체의 상태가 그대로 유지됨을 강조하면서 변경사항을 새 복사본에 포함하는 과정을 간결하게 표현한다.

    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, this.month, this.day);
    }
    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(this.year, newMonth, this.day);
    }
    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(this.year, this.month, newDay);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
