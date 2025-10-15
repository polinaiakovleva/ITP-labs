public class TimeCreator {
    public static Time createTime(int hours) {
        return new Time(hours);
    }

    public static Time createTime(int hours, int minutes) {
        return new Time(hours, minutes);
    }

    public static Time createTime(int hours, int minutes, int seconds) {
        return new Time(hours, minutes, seconds);
    }

}