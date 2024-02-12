package clases;

import clases.Address;

public class Customer {
    //state
    private String name;
    private Address homeAddress;
    private Address workAddress;

    //creating
    public Customer(String name, Address homeAddress){
        this.name = name;
        this.homeAddress = homeAddress;
    }
}
