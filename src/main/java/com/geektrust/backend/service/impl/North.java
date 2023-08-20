package com.geektrust.backend.service.impl;

import com.geektrust.backend.constant.Axis;
import com.geektrust.backend.service.AbstractGManPowerCalculatorService;

public class North extends AbstractGManPowerCalculatorService {
    
    @Override
    public int getMinimumNumberOfRotations(Axis axis){
        int numOfDirections=1;

        if(axis == Axis.POSITIVE_Y_AXIS) numOfDirections = 0;
        if(axis == Axis.NEGATIVE_Y_AXIS || axis == Axis.Q4 || axis == Axis.Q3) numOfDirections =2;
        
        return numOfDirections;
    }

}
