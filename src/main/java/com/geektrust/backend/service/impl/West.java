package com.geektrust.backend.service.impl;

import com.geektrust.backend.constant.Axis;
import com.geektrust.backend.service.AbstractGManPowerCalculatorService;

public class West  extends AbstractGManPowerCalculatorService {
    
    @Override
    public int getMinimumNumberOfRotations(Axis axis) {
        int numOfDirections=1;

        if(axis == Axis.NEGATIVE_X_AXIS) numOfDirections = 0;
        if(axis == Axis.POSITIVE_X_AXIS || axis == Axis.Q1 || axis == Axis.Q4) numOfDirections =2;
        
        return numOfDirections;
    }


}
