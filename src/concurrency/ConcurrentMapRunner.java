package concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    public static void main(String[] args) {
        ConcurrentMap<Character, LongAdder> ocurrances = new ConcurrentHashMap<>() {
        };

        String str = "ABCD ABCD ABCD";

        for(char character:str.toCharArray()){
            ocurrances.computeIfAbsent(character, ch -> new LongAdder()).increment();
//            LongAdder longAdder = ocurrances.get(character);
//            if(longAdder == null){
//                longAdder = new LongAdder();
//            }
//            longAdder.increment();
//            ocurrances.put(character, longAdder);
       }

        System.out.println(ocurrances);
    }
}
