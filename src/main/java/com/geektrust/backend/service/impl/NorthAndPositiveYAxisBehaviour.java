package com.geektrust.backend.service.impl;

import com.geektrust.backend.constant.AppConstant;
import com.geektrust.backend.service.DirectionBehaviour;

public class NorthAndPositiveYAxisBehaviour implements DirectionBehaviour {

    private final int DIRECTIONS = 0;

    @Override
    public int getDirections(char dir, int diffX, int diffY) {
        return diffY < 0 && diffX == 0 && AppConstant.NORTH-dir==0 ? DIRECTIONS : AppConstant.INVALID_BEHAVIOUR;
    }
    
}
