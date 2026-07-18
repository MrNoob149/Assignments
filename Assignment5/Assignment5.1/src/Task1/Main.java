package Task1;

public class Main {
    public static void main (String[] args) {
        Run odd = new Run(false);
        Run even = new Run(true);
        even.start();
        odd.start();
    }
}
