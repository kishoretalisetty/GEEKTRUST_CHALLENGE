package com.geektrust.backend.factory;

import com.geektrust.backend.exception.InvalidDirectionException;
import com.geektrust.backend.service.PowerOfGMan;
import com.geektrust.backend.service.impl.East;
import com.geektrust.backend.service.impl.North;
import com.geektrust.backend.service.impl.South;
import com.geektrust.backend.service.impl.West;

public  class CalculatePowerOfGManFactory {
    // INSTANCE;

    public PowerOfGMan getInstance(char direction){

        switch (direction){
            case 'E':
                return new East();
            case 'W':
               return new West();
            case 'N':
               return new North();
            case 'S':
               return new South();
            default:
               throw new InvalidDirectionException();
        }
    }
    
}
