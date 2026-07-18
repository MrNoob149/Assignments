package Task2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculate calculate = new Calculate();
        int cores = Runtime.getRuntime().availableProcessors();
        long begin_time = System.currentTimeMillis();
        for (int i = 0; i < cores; i++) {
            Thread t = new Thread(calculate);
            t.start();
            //                Thread.sleep(1000);
            int total_sum =+calculate.getSum();
            System.out.println("The total sum is: " + total_sum);
            t.join();

        }
        long end_time = System.currentTimeMillis();
        long time = end_time - begin_time;
        System.out.println("Time "  + time);
    }
}