package com.geektrust.backend.service;

import com.geektrust.backend.request.Request;

public interface InputOperation {
    public void apply(Request request, String[] inputs);
}
