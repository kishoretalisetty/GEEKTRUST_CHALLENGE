package com.geektrust.backend.request;

public class Request {
    private int srcX;
    private int srcY;
    private int destX;
    private int destY;

    public Request() {

    }

    public Request(int srcX, int srcY, int destX, int destY, char direction) {
        this.srcX = srcX;
        this.srcY = srcY;
        this.destX = destX;
        this.destY = destY;
        this.direction = direction;
    }

    private char direction;

    public int getSrcX() {
        return srcX;
    }

    public void setSrcX(int srcX) {
        this.srcX = srcX;
    }

    public int getSrcY() {
        return srcY;
    }

    public void setSrcY(int srcY) {
        this.srcY = srcY;
    }

    public int getDestX() {
        return destX;
    }

    public void setDestX(int destX) {
        this.destX = destX;
    }

    public int getDestY() {
        return destY;
    }

    public void setDestY(int destY) {
        this.destY = destY;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }
}