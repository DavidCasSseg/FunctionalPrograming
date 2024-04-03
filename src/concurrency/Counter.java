package concurrency;

public class Counter {
    private int i;

    synchronized public void increment(){
        i++;
        // get i
        // increment
        // set i
    }

    public int getI(){
        return i;
    }
}
