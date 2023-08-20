package com.geektrust.backend.factory;

import java.util.HashMap;
import com.geektrust.backend.constant.AppConstant;
import com.geektrust.backend.service.InputOperation;
import com.geektrust.backend.service.impl.DestinationOperation;
import com.geektrust.backend.service.impl.PrintPowerOperation;
import com.geektrust.backend.service.impl.SourceOperation;

public class InputOperationInvoker {
    private HashMap<String,InputOperation> map = new HashMap<>();
    
    public InputOperationInvoker() {
        map.put(AppConstant.CMD_SOURCE, new SourceOperation());
        map.put(AppConstant.CMD_DEST, new DestinationOperation());
        map.put(AppConstant.CMD_PRINT_POWER, new PrintPowerOperation());
    }

    public InputOperation getInstance(String cmd){
        return map.get(cmd);
    }
}
