package programacionFuncional;

import java.sql.SQLOutput;
import java.util.stream.LongStream;

public class FP05Parallelizing {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        //0, 10000000000
        //System.out.println(LongStream.range(0,1000000000).sum());//499999999500000000 // time 1510
        System.out.println(LongStream.range(0,1000000000).parallel().sum());//t
        System.out.println(System.currentTimeMillis() - time);


    }

}
