package clases;

import interfaces.Flyable;

public class Aeroplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("whit fuel");
    }
}
