package ru.netology.stats;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void nextChannel() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }

    }

    public void prevChannel() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 1) {
            currentVolume = 0;
        }
        if (currentVolume > 99) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public void turnUpTheVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        }
    }

    public void turnDownTheVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }


}