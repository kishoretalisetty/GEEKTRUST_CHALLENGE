package com.geektrust.backend.service;

import com.geektrust.backend.constant.AppConstant;
import com.geektrust.backend.constant.Axis;

public abstract class AbstractGManPowerCalculatorService {

    private final int DIFF_ZERO = 0;

    public int calculatePower(int srcX, int srcY, int destX, int destY) {
        int diffX = srcX - destX;
        int diffY = srcY - destY;

        if(isAtSamePoint(diffX, diffY)) return AppConstant.TOTAL_POWER;

        int numberOfSteps=Math.abs(diffX) + Math.abs(diffY);
        Axis axis = getAxis(diffX, diffY);
		int numOfDirections=getMinimumNumberOfRotations(axis);

        int totalGmanPowerReduced=(numberOfSteps*AppConstant.STEP_POWER)+(numOfDirections*AppConstant.DIR_POWER);
        int remainingPower = AppConstant.TOTAL_POWER-totalGmanPowerReduced;

        System.out.println("POWER "+remainingPower);
        return remainingPower;
    }

    public boolean isAtSamePoint(int diffX, int diffY) {
        return diffX == DIFF_ZERO && diffY == DIFF_ZERO;
    }



    public Axis getAxis(int diffX, int diffY) {
        if(diffX == DIFF_ZERO && diffY < DIFF_ZERO) return Axis.POSITIVE_Y_AXIS;
        if(diffX == DIFF_ZERO && diffY > DIFF_ZERO) return Axis.NEGATIVE_Y_AXIS;
        if(diffX < DIFF_ZERO && diffY == DIFF_ZERO) return Axis.POSITIVE_X_AXIS;
        if(diffX > DIFF_ZERO && diffY == DIFF_ZERO) return Axis.NEGATIVE_X_AXIS;
        if(diffX < DIFF_ZERO && diffY < DIFF_ZERO) return Axis.Q1;
        if(diffX > DIFF_ZERO && diffY < DIFF_ZERO) return Axis.Q2;
        if(diffX > DIFF_ZERO && diffY > DIFF_ZERO) return Axis.Q3;
        return Axis.Q4;
    }

    public abstract int getMinimumNumberOfRotations(Axis axis);
}
