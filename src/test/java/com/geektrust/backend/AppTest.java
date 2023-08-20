package com.geektrust.backend;

import com.geektrust.backend.factory.CalculatePowerOfGManFactory;
import com.geektrust.backend.service.AbstractGManPowerCalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("App Test")
class AppTest {

    @Test
    public void Application_Test() throws Exception{
        // Arrange
        // Act   
        // Assert
        Assertions.assertTrue(true);
    }

    @Test
    public void eastDirectionTest(){
        CalculatePowerOfGManFactory cFactory=new CalculatePowerOfGManFactory();
        AbstractGManPowerCalculatorService pGMan=cFactory.getInstance('E');
        int actual= pGMan.calculatePower(2, 1, 4, 3);
        int expected=155;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void westDirectionTest(){
        CalculatePowerOfGManFactory cFactory=new CalculatePowerOfGManFactory();
        AbstractGManPowerCalculatorService pGMan=cFactory.getInstance('W');
        int actual= pGMan.calculatePower(0, 5, 6, 1);
        int expected=90;
        Assertions.assertEquals(expected, actual);
    }

    
    @Test
    public void northDirectionTest(){
        CalculatePowerOfGManFactory cFactory=new CalculatePowerOfGManFactory();
        AbstractGManPowerCalculatorService pGMan=cFactory.getInstance('N');
        int actual= pGMan.calculatePower(3, 6, 1, 0);
        int expected=110;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void southDirectionTest(){
        CalculatePowerOfGManFactory cFactory=new CalculatePowerOfGManFactory();
        AbstractGManPowerCalculatorService pGMan=cFactory.getInstance('S');
        int actual= pGMan.calculatePower(3, 6, 3, 6);
        int expected=200;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void integrationTest() {
        String[] args = new String[]{"src/input.txt"};
        App.main(args);
    }

}
