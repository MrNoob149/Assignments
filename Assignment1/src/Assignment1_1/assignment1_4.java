package Assignment1_1;

public class assignment1_4 {
    private String name;

    public assignment1_4(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        assignment1_4 cat = new assignment1_4("Whiskers");
        assignment1_4 cat2 = new assignment1_4("Whiskers");
        assignment1_4 cat3 = new assignment1_4("Rex");
        assignment1_4 cat4 = new assignment1_4("Whiskers");


        // Call the meow method on the cat instance
        cat.meow();
        cat2.meow();
        cat3.meow();
        cat4.meow();
    }
}