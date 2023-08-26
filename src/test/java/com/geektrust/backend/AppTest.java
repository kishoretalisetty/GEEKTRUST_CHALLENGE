package com.geektrust.backend;

import com.geektrust.backend.constant.AppConstant;
import com.geektrust.backend.service.AbstractGManPowerCalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("App Test")
class AppTest {

    private AbstractGManPowerCalculatorService service = new AbstractGManPowerCalculatorService();

    @Test
    public void Application_Test() throws Exception{
        // Arrange
        // Act   
        // Assert
        Assertions.assertTrue(true);
    }

    @Test
    public void eastDirectionTest(){
        int actual= service.calculatePower(AppConstant.EAST,2, 1, 4, 3);
        Assertions.assertEquals(155, actual);
    }

    @Test
    public void westDirectionTest(){
        int actual= service.calculatePower(AppConstant.WEST,0, 5, 6, 1);
        Assertions.assertEquals(90, actual);
    }

    
    @Test
    public void northDirectionTest(){
        int actual= service.calculatePower(AppConstant.NORTH,3, 6, 1, 0);
        Assertions.assertEquals(110, actual);
    }

    @Test
    public void southDirectionTest(){
        int actual= service.calculatePower(AppConstant.SOUTH,3, 6, 3, 6);
        Assertions.assertEquals(200, actual);
    }

    @Test
    public void integrationTest() {
        String[] args = new String[]{"src/input.txt"};
        App.main(args);
    }

}
