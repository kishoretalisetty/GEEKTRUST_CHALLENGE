package com.geektrust.backend.service.impl;

import com.geektrust.backend.request.Request;
import com.geektrust.backend.service.InputOperation;

public class SourceOperation implements InputOperation{

    @Override
    public void apply(Request request, String[] inputs) {
        request.setSrcX(Integer.valueOf(inputs[1]));
        request.setSrcY(Integer.valueOf(inputs[2]));
        request.setDirection(inputs[3].charAt(0));
    }
    
}
