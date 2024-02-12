package abstrac;

import interfaces.Flyable;

public class Bird  implements Flyable {

    @Override
    public void fly() {
        System.out.println("whit wings");
    }


}
