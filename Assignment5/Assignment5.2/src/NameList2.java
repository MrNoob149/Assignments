//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;

class NameList2 extends Thread {
    private String name;
    static ArrayList<String> names = new ArrayList();

    public NameList2(String var1) {
        this.name = var1;
    }

    public synchronized void addname(String var1) {
        names.add(var1);
    }

    public synchronized void removename(String var1) {
        names.remove(var1);
    }

    public synchronized void run() {
        for(int var1 = 0; var1 <= 20; ++var1) {
            this.addname(this.name);
            System.out.println(this.name + " is added to the list");
            this.removename(this.name);
            System.out.println(this.name + " is removed from the list");
        }

    }
}
