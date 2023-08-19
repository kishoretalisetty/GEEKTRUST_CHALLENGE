package com.geektrust.backend.service;

import com.geektrust.backend.constant.AppConstant;

public abstract class AbstractGManPowerCalculatorService {
    public int calcultePower(int srcX, int srcY, int destX, int destY) {
        int diffX=srcX - destX;
        int diffY=srcY - destY;
       
        int numberOfSteps=Math.abs(diffX)+Math.abs(diffY);
		int numOfDirections=getMinimumNumberOfRotations(diffX,diffY);

        int totalGmanPowerReduced=(numberOfSteps*AppConstant.STEP_POWER)+(numOfDirections*AppConstant.DIR_POWER);
        int remainingPower = AppConstant.TOTAL_POWER-totalGmanPowerReduced;

        System.out.println("POWER "+remainingPower);
        return remainingPower;
    }
    public abstract int getMinimumNumberOfRotations(int diffX, int diffY);
}
