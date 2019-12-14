import java.util.TimerTask;

public class Time extends TimerTask {
    protected static int minute = 0;

    public static void increaseTime() {
        minute++;
        System.out.println("Прошла минута");
    }

    public static String getMinutes(){
        return "Прошло " + minute + " минут";
    }

    @Override
    public void run() {
        minute++;
        System.out.println("Прошла минута");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
