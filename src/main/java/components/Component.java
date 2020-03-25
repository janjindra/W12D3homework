package components;

public abstract class Component {

    //instance variables
    private String manufacturer;
    private int yearMade;

    //constructor
    public Component(String manufacturer, int yearMade){
       this.manufacturer = manufacturer;
       this.yearMade = yearMade;
    }

    //methods



    //getters
    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearMade() {
        return yearMade;
    }
}
