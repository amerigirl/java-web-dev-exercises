package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;


public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your
    // personal GitLab account)

    Car test_car;

    @Before
    public void createCarObject() {
    test_car = new Car("Toyota", "Prius", 10, 50);
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    //TODO: constructor sets gasTankLevel properly

    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void assertGasTankFalse (){
    assertFalse(this.test_car.getGasTankSize() > 11);
    }

    @Test

    public void assertGasTankTrue () {
        assertTrue(this.test_car.getGasTankSize() == 10);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test

    public void driveCheck() {
        this.test_car.drive(50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
public void gastankAccuracy() {
        assertT
}

    //TODO: can't have more gas than tank size, expect an exception

}
