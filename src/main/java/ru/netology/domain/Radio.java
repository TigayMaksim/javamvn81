package ru.netology.domain;


public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setNextStation() {

        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }

    }

    public int getNextStation() {
        return currentStation;
    }


    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        if (currentStation < 9) {
            currentStation = currentStation - 1;
        }
    }

    public int getPrevStation() {
        return currentStation;
    }


    public int plusVolume;

    public void setPlusVolume() {

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 0;
        }
    }

    public int getPlusVolume() {
        return currentVolume;
    }


    public int minusVolume;

    public void setMinusVolume() {
        if (currentVolume == 0) {
            currentVolume = 10;
        }
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getMinusVolume() {

        return currentVolume;
    }
}
