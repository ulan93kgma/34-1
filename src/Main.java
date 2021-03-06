import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
    int min = 60;
    int sec = 60;
    int day = 24;
    int week = 7;
    int month = 30;
    int hour = min * sec;
    day = hour * day;
    week = day * week;
    month = month * day;
        ArrayList<Integer> time = new ArrayList<>();
        time.add(sec);
        time.add(hour);
        time.add(day);
        time.add(week);
        time.add(month);
        time.forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        Collections.sort(time);
        time.forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        int search = Collections.binarySearch(time, sec);
        System.out.println(search);
        System.out.println("---------------------------------------------------");
        Collections.reverse(time);
        time.forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        Collections.shuffle(time);
        time.forEach(System.out::println);
        System.out.println("max = " + Collections.max(time));
        System.out.println("min = " + Collections.min(time));
        System.out.println("--------------------------------------------------");
        Collections.fill(time, 42);
        time.forEach(System.out::println);
    }
}
