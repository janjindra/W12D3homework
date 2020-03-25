package vehicles;

import components.*;

import java.util.ArrayList;

public abstract class Car implements ICarBuild {

    //instance variables
    private String make;
    private String model;
    private int price;
    private String color;
    private ArrayList<Component> allComponents;
    private boolean damage;

    //constructor
    public Car(String make, String model, int price, String color, boolean damage){
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.allComponents = new ArrayList<Component>();
        this.damage = damage;
    }

    //methods
    public void carBuild(Battery battery, Breaks breaks, Engine engine, GearBox gearBox, Tyres tyres){
        allComponents.add(battery);
        allComponents.add(breaks);
        allComponents.add(engine);
        allComponents.add(gearBox);
        allComponents.add(tyres);
    }

    //getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        if (this.damage == true) {
            return this.price - 10000;
        } else {
            return this.price;
        }
    }

    public String getColor() {
        return color;
    }

    public ArrayList<Component> getAllComponents() {
        return allComponents;
    }

    public boolean getDamage() {
        return damage;
    }

    //setters
    public void setDamage(boolean damage) {
        this.damage = damage;
    }

}
