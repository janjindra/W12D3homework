import entities.Customer;
import entities.Dealership;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.DieselCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    @Before
    public void before(){
        dealership = new Dealership(200000);
    }

    @Test
    public void canAddVehicleToDealership(){
        DieselCar dieselCar = new DieselCar("Skoda","Rapid",30000,"blue", false);
        dealership.buyVehicle(dieselCar);
        assertEquals(1,dealership.getAllCarsPerDealer().size());
        assertEquals(30000,dealership.getAllCarsPerDealer().get(0).getPrice());
    }

    @Test
    public void canIncreaseTill(){
        Customer customer = new Customer(40000);
        DieselCar dieselCar = new DieselCar("Skoda","Rapid",30000,"blue", false);
        dealership.increaseTill(dieselCar.getPrice());
        assertEquals(230000, dealership.getTill());
    }

    @Test
    public void canReduceTill(){
        DieselCar dieselCar = new DieselCar("Skoda","Rapid",30000,"blue", false);
        dealership.reduceTill(dieselCar.getPrice());
        assertEquals(170000, dealership.getTill());
    }

    @Test
    public void canSellVehicleToCustomer() {
        Customer customer = new Customer(40000);
        DieselCar dieselCar = new DieselCar("Skoda","Rapid",30000,"blue", false);
        dealership.buyVehicle(dieselCar);
        dealership.sellVehicleToCustomer(customer,dieselCar);
        assertEquals(0,dealership.getAllCarsPerDealer().size());
        assertEquals(1,customer.getAllCarsPerCustomer().size());
        assertEquals("Rapid",customer.getAllCarsPerCustomer().get(0).getModel());
        assertEquals(10000,customer.getMoney());
        assertEquals(200000, dealership.getTill());
    }

    @Test
    public void canRepairDamage(){
        DieselCar dieselCar = new DieselCar("Skoda","Rapid",30000,"blue", true);
        dealership.repairDamage(dieselCar);
        assertEquals(false,dieselCar.getDamage());
        assertEquals(30000,dieselCar.getPrice());
        assertEquals(190000,dealership.getTill());
    }


}
