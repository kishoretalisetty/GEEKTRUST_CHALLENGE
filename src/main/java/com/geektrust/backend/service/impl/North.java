package com.geektrust.backend.service.impl;

import com.geektrust.backend.service.PowerOfGMan;

public class North implements PowerOfGMan {
    
    public int calcultethePowerOfGman(int sour_x,int sour_y,int des_x,int des_y){
        int diffX=sour_x - des_x;
        int diffY=sour_y - des_y;
       
        int numberOfSteps=Math.abs(diffX)+Math.abs(diffY);
        int numOfDirections=0;
        
        if(diffX==0 && diffY==0) numOfDirections = 0;
        else if (diffX==0 && diffY < 0) {  numOfDirections= 0; }
        else if(diffY>0){ numOfDirections= 2;}
        else{ numOfDirections= 1; }
        
        int totalGmanPowerReduced=(numberOfSteps*10)+(numOfDirections*5);
        int remainingPower=200-totalGmanPowerReduced;
        return remainingPower;
    }

}
