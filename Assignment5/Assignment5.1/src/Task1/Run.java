package Task1;

public class Run extends Thread {

    private boolean even;
    public Run(boolean even) {
        this.even = even;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            if (even == true && (i % 2) ==0) {
                System.out.println("Even thread: " + i );
            } else if (even != true && (i % 2) !=0) {
                System.out.println("Odd thread: " + i);
            try {
                Thread.sleep(1000); {
        }} catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}}
