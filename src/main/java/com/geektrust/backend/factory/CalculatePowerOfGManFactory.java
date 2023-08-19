package com.geektrust.backend.factory;

import java.util.HashMap;
import com.geektrust.backend.constant.AppConstant;
import com.geektrust.backend.service.AbstractGManPowerCalculatorService;
import com.geektrust.backend.service.impl.East;
import com.geektrust.backend.service.impl.North;
import com.geektrust.backend.service.impl.South;
import com.geektrust.backend.service.impl.West;

public class CalculatePowerOfGManFactory {
    private HashMap<Character,AbstractGManPowerCalculatorService> map = new HashMap<>();

    public CalculatePowerOfGManFactory() {
        map.put(AppConstant.EAST, new East());
        map.put(AppConstant.WEST, new West());
        map.put(AppConstant.NORTH, new North());
        map.put(AppConstant.SOUTH, new South());
    }

    public AbstractGManPowerCalculatorService getInstance(char direction){
        return map.get(direction);
    }
    
    
}
