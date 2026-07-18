import java.util.ArrayList;

class NameList extends Thread{
    private final String name;
     ArrayList<String> names = new ArrayList<>();


    public NameList(String name) {
        this.name = name;
    }

    public  synchronized void addname(String name) {
        names.add(name);
        System.out.println(name + " is added to the list");

    }

    public  synchronized void removename(String name) {
        names.remove(name);
        System.out.println(name + " is removed from the list");

    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            synchronized (NameList.class) {
            addname(name);
            removename(name);
        }
    }
}
}

public class Task2 {
    public static void main(String[] args) {

        NameList name1 = new NameList("John");
        NameList name2 = new NameList("Jack");
        NameList name3 = new NameList("Quack");
        name1.start();
        name2.start();
        name3.start();
        try {
            name1.join();
            name2.join();
            name3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}