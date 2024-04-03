package concurrency;

public class BiCounterWithLock {
    private int i = 0;
    private int j = 0;

    synchronized public void incrementI(){
        //Get Lock
        i++;
        //Release Lock
    }

    synchronized public void incrementJ(){
        //Get Lock
        j++;
        //
    }

    public int getI(){
        return i;
    }

    public int getJ(){
        return j;
    }
}
