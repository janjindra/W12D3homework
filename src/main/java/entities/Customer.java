package entities;

import vehicles.Car;

import java.util.ArrayList;

public class Customer {

    //instance variables
    public int money;
    ArrayList<Car> allCarsPerCustomer;

    //constructor
    public Customer(int money) {
        this.money = money;
        this.allCarsPerCustomer = new ArrayList<Car>();
    }

    //methods
    public void buyVehicle(Car car){
        allCarsPerCustomer.add(car);
    }

    public int reduceMoney(int amount){
        return this.money -= amount;
    }

    //getters
    public int getMoney() {
        return money;
    }

    public ArrayList<Car> getAllCarsPerCustomer() {
        return allCarsPerCustomer;
    }
}
