public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours) {
        this.hours = hours;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time increase() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24) {
                    hours = 0;
                }
            }
        }
        return this;
    }

    public int difference(Time time2) {
        int total1 = hours * 3600 + minutes * 60 + seconds;
        int total2 = time2.hours * 3600 + time2.minutes * 60 + time2.seconds;

        if (total1 > total2) {
            return total1 - total2;
        }
        else {
            return total2 - total1;
        }
    }
    public void printTime() {
        System.out.print(hours + "." + minutes + '.' + seconds);
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}

