public class ex3 {
    public static void main(String[] args) {
        Time time1 = TimeCreator.createTime(10, 15, 49);
        Time time2 = TimeCreator.createTime(7);

        int difference = time1.difference((time2));
        int hours = difference / 3600;
        int minutes = (difference % 3600) / 60;
        int seconds = difference % 60;
        System.out.print("The difference between ");
        time1.printTime();
        System.out.print(" and ");
        time2.printTime();
        System.out.print(": ");
        System.out.println(hours + ":" + minutes + ":" + seconds);



    }
}