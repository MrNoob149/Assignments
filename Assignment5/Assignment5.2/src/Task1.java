import java.util.Random;
import java.util.ArrayList;

class Theater {
    private int seats;

    public Theater(int seats) {
        this.seats = seats;
    }

    public synchronized boolean request(int tickets) {
        if (seats >= tickets) {
            seats = seats - tickets;
            return true;
        } else {
            return false;
        }
    }

    public int getSeats() {
        return seats;
    }
}
    public class Task1 {
        public static void main(String[] args) {
            ArrayList<Thread> threads = new ArrayList<>();
            Random random = new Random();
            Theater theater = new Theater(10);
            for (int j = 0; j <= 10; j++) {
                int finalJ = j;
                Thread thread1 = new Thread(() -> {
                    {
                        int seat = random.nextInt(1, 5);
                        theater.request(seat);


                        if (theater.getSeats() > 0) {
                            System.out.println("Customer " + finalJ + " have reserved " + seat);
                        } else {
                            System.out.println("Customer " + finalJ + " couldn't reserved " + seat + " tickets");
                        }
                    }
                    ;
                });
                threads.add(thread1);
                thread1.start();

            }
        }
    }
