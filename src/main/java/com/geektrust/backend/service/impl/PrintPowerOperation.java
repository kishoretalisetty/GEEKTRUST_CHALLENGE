package com.geektrust.backend.service.impl;

import com.geektrust.backend.request.Request;
import com.geektrust.backend.service.AbstractGManPowerCalculatorService;
import com.geektrust.backend.service.InputOperation;

public class PrintPowerOperation implements InputOperation{

    private AbstractGManPowerCalculatorService service;

    public PrintPowerOperation(){
        service = new AbstractGManPowerCalculatorService();
    }

    @Override
    public void apply(Request request, String[] inputs) {
        service.calculatePower(request.getDirection(),
                    request.getSrcX(),
				    request.getSrcY(),
					request.getDestX(),
					request.getDestY());
    }
    
}
