package Task2;
import java.util.Arrays;
import java.util.Random;

public class Calculate extends Thread{
    Random r= new Random();
    private int sum;

    @Override
    public void run() {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(100000);
        }
        sum = Arrays.stream(numbers).sum();
    }

    public int getSum() {
        return sum;
    }
}
