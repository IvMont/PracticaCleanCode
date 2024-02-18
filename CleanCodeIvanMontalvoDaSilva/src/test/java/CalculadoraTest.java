/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.cleancodeivanmontalvo.Calculadora;
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
public class CalculadoraTest {

    public CalculadoraTest() {
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
    public void testAdd() {
        Calculadora calculator = new Calculadora();
        assertEquals(4, calculator.sumar(2, 2));
    }

    @Test
    public void testSubtract() {
        Calculadora calculator = new Calculadora();
        assertEquals(3, calculator.restar(5, 2));
    }

    @Test
    public void testMultiply() {
        Calculadora calculator = new Calculadora();
        assertEquals(10, calculator.multiplicar(2, 5));
    }

    @Test
    public void testDivide() {
        Calculadora calculator = new Calculadora();
        assertEquals(2, calculator.dividir(10, 5));
    }

}
