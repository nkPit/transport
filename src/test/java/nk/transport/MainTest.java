package nk.transport;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit тесты для App.class.
 */
public class MainTest {

    @Test
    public void testCar(){
        TransportFactory transportFactoryCar = new TransportFactory();
        Transport car =  transportFactoryCar.createTransport(TransportType.Car);
        assertEquals(car.getTypeTransport(), "Автомобиль");
        assertEquals(car.getNumberOfWheel(), 4);
        assertEquals(car.getMaxSpeed(), 150);
        assertEquals(car.getAbout(), "Это автомобиль");
    }

    @Test
    public void testMotorcycle(){
        TransportFactory transportFactoryCar = new TransportFactory();
        Transport car =  transportFactoryCar.createTransport(TransportType.Motorcycle);
        assertEquals(car.getTypeTransport(), "Мотоцикл");
        assertEquals(car.getNumberOfWheel(), 2);
        assertEquals(car.getMaxSpeed(), 200);
        assertEquals(car.getAbout(), "Это мотоцикл");
    }

    @Test
    public void testScooter(){
        TransportFactory transportFactoryCar = new TransportFactory();
        Transport car =  transportFactoryCar.createTransport(TransportType.Scooter);
        assertEquals(car.getTypeTransport(), "Самокат");
        assertEquals(car.getNumberOfWheel(), 2);
        assertEquals(car.getMaxSpeed(), 50);
        assertEquals(car.getAbout(), "Это самокат");
    }

    @Test
    public void testBus(){
        TransportFactory transportFactoryCar = new TransportFactory();
        Transport car =  transportFactoryCar.createTransport(TransportType.Bus);
        assertEquals(car.getTypeTransport(), "Автобус");
        assertEquals(car.getNumberOfWheel(), 6);
        assertEquals(car.getMaxSpeed(), 100);
        assertEquals(car.getAbout(), "Это автобус");
    }
}
