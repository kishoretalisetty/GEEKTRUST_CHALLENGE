package com.geektrust.backend;

import com.geektrust.backend.exception.InvalidDirectionException;
import com.geektrust.backend.factory.CalculatePowerOfGManFactory;
import com.geektrust.backend.service.PowerOfGMan;
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
    public void EastDirctionTest(){
        CalculatePowerOfGManFactory cFactory=new CalculatePowerOfGManFactory();
        PowerOfGMan pGMan=cFactory.getInstance('E');
        int actual= pGMan.calcultethePowerOfGman(2, 1, 4, 3);
        int expected=155;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void WestDirctionTest(){
        CalculatePowerOfGManFactory cFactory=new CalculatePowerOfGManFactory();
        PowerOfGMan pGMan=cFactory.getInstance('W');
        int actual= pGMan.calcultethePowerOfGman(0, 5, 6, 1);
        int expected=90;
        Assertions.assertEquals(expected, actual);
    }

    
    @Test
    public void NorthDirctionTest(){
        CalculatePowerOfGManFactory cFactory=new CalculatePowerOfGManFactory();
        PowerOfGMan pGMan=cFactory.getInstance('N');
        int actual= pGMan.calcultethePowerOfGman(3, 6, 1, 0);
        int expected=110;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SouthDirctionTest(){
        CalculatePowerOfGManFactory cFactory=new CalculatePowerOfGManFactory();
        PowerOfGMan pGMan=cFactory.getInstance('S');
        int actual= pGMan.calcultethePowerOfGman(3, 6, 3, 6);
        int expected=200;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void InvalidDirctionExceptionTest(){
        CalculatePowerOfGManFactory cFactory=new CalculatePowerOfGManFactory();
        Assertions.assertThrows(InvalidDirectionException.class ,()->cFactory.getInstance('e'));
    }

}
