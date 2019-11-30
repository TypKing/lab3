public class Time {
    private static int minute = 0;

    public static void increaseTime() {
        minute++;
        System.out.println("Прошла минута");
    }

    public static String getMinutes(){
        return "Прошло " + minute + " минут";
    }
}
