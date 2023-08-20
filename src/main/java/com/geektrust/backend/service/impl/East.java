package com.geektrust.backend.service.impl;

import com.geektrust.backend.constant.Axis;
import com.geektrust.backend.service.AbstractGManPowerCalculatorService;

public class East extends AbstractGManPowerCalculatorService {
    
    @Override
    public int getMinimumNumberOfRotations(Axis axis){
        int numOfDirections=1;

        switch (axis) {
            case POSITIVE_X_AXIS :
                numOfDirections = 0;
                break;
            case Q2 :
            case NEGATIVE_X_AXIS :
            case Q3 :
                numOfDirections = 2;
                break;
            default:
                break;
        }
        
        return numOfDirections;
    }
}
