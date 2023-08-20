package com.geektrust.backend.service.impl;

import com.geektrust.backend.service.AbstractGManPowerCalculatorService;

public class West  extends AbstractGManPowerCalculatorService {
    
    @Override
    public int getMinimumNumberOfRotations(int diffX, int diffY) {
        int numOfDirections=1;
        
        if(diffX==0 && diffY==0) numOfDirections = 0;
        else if (diffY==0 && diffX > 0) {  numOfDirections= 0; }
        else if(diffX<0){ numOfDirections= 2;}
        
        return numOfDirections;
    }


}
