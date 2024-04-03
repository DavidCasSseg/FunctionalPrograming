package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
    private int i = 0;
    private int j = 0;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    public void incrementI(){
        //Get Lock For I
        lockForI.lock();
        i++;
        //Release Lock For I
        lockForI.unlock();
    }

    public void incrementJ(){
        //Get Lock For J
        lockForJ.lock();
        j++;
        //Release Lock For J
        lockForJ.unlock();
    }

    public int getI(){
        return i;
    }

    public int getJ(){
        return j;
    }
}
