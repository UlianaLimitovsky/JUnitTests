package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.management.ConstructorParameters;


@DisplayName("Test class Calc")
public class CalculatorTest {
    Calculator calculator = new Calculator();

//    @BeforeEach
//    public void before(){
//        System.out.println("класс Cals готов");
//    }
//
//    @AfterEach
//    public void after(){
//        System.out.println("Тест завершен");
//    }


    @Test
    @Tag("baseMethodCalc")
    public void testPlus(){
        Assertions.assertEquals(20, calculator.plus(10,10));
    }

    @Test
    @Tag("baseMethodCalc")
    @DisplayName("Test method minus")
    public void  testMinus() {
        Assertions.assertEquals(2,calculator.minus(4,2));
    }

    @Test
    public void testDivision() {
        Assertions.assertEquals(2, calculator.division(5,2));
    }

    @Test
    public void testDivisionWithDouble() {
        Assertions.assertEquals(2.5, calculator.division(5.0,2.0));
    }

    @Test
    public void testDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, ()-> calculator.division(10,0));
    }

    @Test
    public void testMultiplication(){
        Assertions.assertEquals(8, calculator.multiplication(4,2));
    }





    @ParameterizedTest
   @ValueSource(ints = {2,4,6,8})
    public void testIsEven(int num){
        Assertions.assertEquals(true, calculator.isEven(num));
        Assertions.assertEquals(false, calculator.isEven(5));

    }


}
