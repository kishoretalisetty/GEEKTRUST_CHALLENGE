package com.geektrust.backend.service.impl;

import com.geektrust.backend.constant.AppConstant;
import com.geektrust.backend.service.DirectionBehaviour;

public class EastAndRightPlaneBehaviour implements DirectionBehaviour {

    private final int DIRECTIONS = 1;

    @Override
    public int getDirections(char dir, int diffX, int diffY) {
        return diffX < 0 && diffY != 0 && AppConstant.EAST-dir==0 ? DIRECTIONS : AppConstant.INVALID_BEHAVIOUR;
    }
    
}
