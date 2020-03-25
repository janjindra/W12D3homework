import entities.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicles.DieselCar;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer(100000);
    }

    @Test
    public void canAddVehicleToCustomer(){
        DieselCar dieselCar = new DieselCar("Skoda","Rapid",30000,"blue", false);
        customer.buyVehicle(dieselCar);
        assertEquals(1,customer.getAllCarsPerCustomer().size());
        assertEquals(30000,customer.getAllCarsPerCustomer().get(0).getPrice());
    }

    @Test
    public void canReduceMoney(){
        DieselCar dieselCar = new DieselCar("Skoda","Rapid",30000,"blue", false);
        customer.reduceMoney(dieselCar.getPrice());
        assertEquals(70000,customer.getMoney());
    }


}
