package com.geektrust.backend.service.impl;
import com.geektrust.backend.request.Request;
import com.geektrust.backend.service.InputOperation;

public class DestinationOperation implements InputOperation{

    @Override
    public void apply(Request request, String[] inputs) {
        request.setDestX(Integer.valueOf(inputs[1]));
        request.setDestY(Integer.valueOf(inputs[2]));
    }
    
}
