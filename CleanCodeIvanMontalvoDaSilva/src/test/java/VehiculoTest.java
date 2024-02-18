/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.cleancodeivanmontalvo.Vehiculo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author iv
 */
public class VehiculoTest {

    public VehiculoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Inicio test");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Fin del test");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Prueba del BeforeEach");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Prueba del AfterEach");
    }

    @Test
    public void testVehicle() {
        Vehiculo vehicle = new Vehiculo("Toyota", "Corolla", 2020);
        assertEquals("Toyota", vehicle.getMarca());
        assertEquals("Corolla", vehicle.getModelo());
        assertEquals(2020, vehicle.getAnyo());
    }
}
