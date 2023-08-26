package com.geektrust.backend.service.impl;

import com.geektrust.backend.constant.AppConstant;
import com.geektrust.backend.service.DirectionBehaviour;

public class SouthAndNegativeYAxisBehaviour implements DirectionBehaviour {

    private final int DIRECTIONS = 0;

    @Override
    public int getDirections(char dir, int diffX, int diffY) {
        return diffY > 0 && diffX == 0 && AppConstant.SOUTH-dir==0 ? DIRECTIONS : AppConstant.INVALID_BEHAVIOUR;
    }
    
}
