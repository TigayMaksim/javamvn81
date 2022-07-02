package ru.netology.domain;


public class Radio {
    private int quantityStation;
    private int maxVolume = 100;
    private int currentStation;
    private int currentVolume;


    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public Radio() {
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > quantityStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }
    public void setNextStation() {

        if (currentStation < quantityStation - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }
    public void setPrevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }else{
            currentStation=quantityStation-1;
        }
    }
    public int getCurrentStation() {
        return currentStation;
    }




    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setPlusVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }
    public void setMinusVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}






