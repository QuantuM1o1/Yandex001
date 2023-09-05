import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int day1 = scanner.nextInt();
        int hour1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int sec1 = scanner.nextInt();
        int year2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int day2 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int sec2 = scanner.nextInt();
        long numberOfSeconds = yearReturn(year2) + monthReturn(month2) + dayReturn(day2) + hourReturn(hour2) + minuteReturn(min2) + sec2 - yearReturn(year1) - monthReturn(month1) - dayReturn(day1) - hourReturn(hour1) - minuteReturn(min1) - sec1;
        System.out.println((numberOfSeconds / 86400) + " " + (numberOfSeconds % 86400));
    }

    public static long yearReturn(int year) {
        return ((year - 1) * 31536000L);
    }

    public static long monthReturn(int month) {
        return switch (month) {
            case 2 -> (86400 * 31);
            case 3 -> (86400 * (31 + 28));
            case 4 -> (86400 * (31 + 28 + 31));
            case 5 -> (86400 * (31 + 28 + 31 + 30));
            case 6 -> (86400 * (31 + 28 + 31 + 30 + 31));
            case 7 -> (86400 * (31 + 28 + 31 + 30 + 31 + 30));
            case 8 -> (86400 * (31 + 28 + 31 + 30 + 31 + 30 + 31));
            case 9 -> (86400 * (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31));
            case 10 -> (86400 * (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30));
            case 11 -> (86400 * (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31));
            case 12 -> (86400 * (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30));
            default -> 0;
        };
    }

    public static long dayReturn(int day) {
        return ((day - 1) * 86400L);
    }

    public static long hourReturn(int hour) {
        return (hour * 3600L);
    }

    public static long minuteReturn(int minute) {
        return (minute * 60L);
    }
}