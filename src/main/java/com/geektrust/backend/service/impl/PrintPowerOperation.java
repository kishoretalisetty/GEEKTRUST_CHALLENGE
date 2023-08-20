package com.geektrust.backend.service.impl;

import com.geektrust.backend.factory.CalculatePowerOfGManFactory;
import com.geektrust.backend.request.Request;
import com.geektrust.backend.service.InputOperation;

public class PrintPowerOperation implements InputOperation{

    @Override
    public void apply(Request request, String[] inputs) {
        new CalculatePowerOfGManFactory().getInstance(request.getDirection())
						.calculatePower(request.getSrcX(),
						request.getSrcY(),
						request.getDestX(),
						request.getDestY());
    }
    
}
