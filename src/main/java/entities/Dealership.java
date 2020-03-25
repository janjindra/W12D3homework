package entities;

import vehicles.Car;

import java.util.ArrayList;

public class Dealership {

    //instance variables
    public int till;
    ArrayList<Car> allCarsPerDealer;

    //constructor
    public Dealership(int money) {
        this.till = money;
        this.allCarsPerDealer = new ArrayList<Car>();
    }

    //methods
    public void buyVehicle(Car car){
        allCarsPerDealer.add(car);
        reduceTill(car.getPrice());
    }

    public int reduceTill(int amount){
        return this.till  -= amount;
    }

    public int increaseTill(int amount){
        return this.till += amount;
    }

    public void sellVehicleToCustomer(Customer customer, Car car){
        allCarsPerDealer.remove(car);
        increaseTill(car.getPrice());
        customer.allCarsPerCustomer.add(car);
        customer.reduceMoney(car.getPrice());
    }

    public void repairDamage(Car car){
        car.setDamage(false);
        reduceTill(10000);
        car.getPrice();
    }

    //getters
    public int getTill() {
        return till;
    }

    public ArrayList<Car> getAllCarsPerDealer() {
        return allCarsPerDealer;
    }


}
