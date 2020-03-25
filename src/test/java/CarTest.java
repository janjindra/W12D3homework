import components.*;
import org.junit.Test;
import vehicles.Car;
import vehicles.DieselCar;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Test
    public void canGetPrice(){
        DieselCar dieselCar1 = new DieselCar("Skoda","Superb",20000,"black", true);
        DieselCar dieselCar2 = new DieselCar("Skoda","Superb",20000,"black", false);
        assertEquals(20000,dieselCar2.getPrice());
        assertEquals(10000,dieselCar1.getPrice());
    }

    @Test
    public void canGetMake(){
        DieselCar dieselCar1 = new DieselCar("Skoda","Superb",20000,"black", true);
        assertEquals("Skoda",dieselCar1.getMake());
    }

    @Test
    public void canGetModel(){
        DieselCar dieselCar1 = new DieselCar("Skoda","Superb",20000,"black", true);
        assertEquals("Superb",dieselCar1.getModel());
    }

    @Test
    public void canGetColor(){
        DieselCar dieselCar1 = new DieselCar("Skoda","Superb",20000,"black", true);
        assertEquals("black",dieselCar1.getColor());
    }

    @Test
    public void canGetDamage(){
        DieselCar dieselCar1 = new DieselCar("Skoda","Superb",20000,"black", true);
        assertEquals(true,dieselCar1.getDamage());
    }

    @Test
    public void canCarBuild(){
        Battery battery = new Battery("Johnson Controls",2016);
        Breaks breaks = new Breaks("Brembo Brake Pad", 2000);
        Engine engine = new Engine("Honda", 2017);
        GearBox gearBox = new GearBox("Volkswagen", 2019);
        Tyres tyres = new Tyres("Michelin", 2018);
        DieselCar dieselCar = new DieselCar("Skoda","Superb",20000,"black", false);
        dieselCar.carBuild(battery,breaks,engine,gearBox,tyres);
        assertEquals(5,dieselCar.getAllComponents().size());
        assertEquals("Honda",dieselCar.getAllComponents().get(2).getManufacturer());
        assertEquals(2016,dieselCar.getAllComponents().get(0).getYearMade());
    }




}
