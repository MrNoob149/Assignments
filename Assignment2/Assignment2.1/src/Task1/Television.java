package Task1;

public class Television {

    private int channel;
    private boolean on;

    public Television() {
        channel = 1;
        on = false;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel > 10) {
            this.channel = 1;
        } else if (channel < 1) {
            this.channel = 10;
        } else {
            this.channel = channel;

        }
    }


    public boolean isOn() {
        return on;
    }

    public void pressOnOff() {
        if (on) {
            on = false;
        } else {
            on = true;
        }
    }
}