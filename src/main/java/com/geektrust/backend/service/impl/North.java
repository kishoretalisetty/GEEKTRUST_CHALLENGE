package com.geektrust.backend.service.impl;

import com.geektrust.backend.constant.Axis;
import com.geektrust.backend.service.AbstractGManPowerCalculatorService;

public class North extends AbstractGManPowerCalculatorService {
    
    @Override
    public int getMinimumNumberOfRotations(Axis axis){
        int numOfDirections=1;
        
        switch (axis) {
            case POSITIVE_Y_AXIS :
                numOfDirections = 0;
                break;
            case Q4 :
            case NEGATIVE_Y_AXIS :
            case Q3 :
                numOfDirections = 2;
                break;
            default:
                break;
        }
        
        return numOfDirections;
    }

}
