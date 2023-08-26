package com.geektrust.backend.service;

import java.util.ArrayList;
import java.util.List;
import com.geektrust.backend.constant.AppConstant;
import com.geektrust.backend.service.impl.EastAndPositiveXAxisBehaviour;
import com.geektrust.backend.service.impl.EastAndRightPlaneBehaviour;
import com.geektrust.backend.service.impl.NorthAndPositiveYAxisBehaviour;
import com.geektrust.backend.service.impl.NorthAndTopPlaneBehaviour;
import com.geektrust.backend.service.impl.SouthAndBottomPlaneBehaviour;
import com.geektrust.backend.service.impl.SouthAndNegativeYAxisBehaviour;
import com.geektrust.backend.service.impl.WestAndLeftPlaneBehaviour;
import com.geektrust.backend.service.impl.WestAndNegativeXAxisBehaviour;

public class AbstractGManPowerCalculatorService {

    private final int DIFF_ZERO = 0;
    private final int MAX_ROTATIONS = 2 ;

    private List<DirectionBehaviour> behaviours;

    public AbstractGManPowerCalculatorService(){
        behaviours = new ArrayList<>();
        behaviours.add(new EastAndPositiveXAxisBehaviour());
        behaviours.add(new WestAndNegativeXAxisBehaviour());
        behaviours.add(new NorthAndPositiveYAxisBehaviour());
        behaviours.add(new SouthAndNegativeYAxisBehaviour());
        behaviours.add(new EastAndRightPlaneBehaviour());
        behaviours.add(new WestAndLeftPlaneBehaviour());
        behaviours.add(new NorthAndTopPlaneBehaviour());
        behaviours.add(new SouthAndBottomPlaneBehaviour());
    }

    public int calculatePower(char dir, int srcX, int srcY, int destX, int destY) {
        int diffX = srcX - destX;
        int diffY = srcY - destY;

        if(isAtSamePoint(diffX, diffY)) return AppConstant.TOTAL_POWER;

        int numberOfSteps=Math.abs(diffX) + Math.abs(diffY);
		int numOfDirections= getMinimumNumberOfRotations(dir, diffX, diffY);

        int totalGmanPowerReduced=(numberOfSteps*AppConstant.STEP_POWER)+(numOfDirections*AppConstant.DIR_POWER);
        int remainingPower = AppConstant.TOTAL_POWER-totalGmanPowerReduced;

        System.out.println("POWER "+remainingPower);
        return remainingPower;
    }

    public boolean isAtSamePoint(int diffX, int diffY) {
        return diffX == DIFF_ZERO && diffY == DIFF_ZERO;
    }

    public int getMinimumNumberOfRotations(char dir, int diffX, int diffY) {
        DirectionBehaviour behaviour = behaviours.stream().filter(b->b.getDirections(dir, diffX, diffY) != -1).findFirst().orElse(null);
        return behaviour == null ? MAX_ROTATIONS : behaviour.getDirections(dir, diffX, diffY);
    }
}
