package com.jfs.learn.exercism;

public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutes) {
        if (minutes < 0 || (expectedMinutesInOven() - minutes) < 0)
            return 0;

        return expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int layers) {
        int MINUTES_PER_LAYER = 2;
        return layers * MINUTES_PER_LAYER;
    }

    public int totalTimeInMinutes(int layers, int minutes) {
        return preparationTimeInMinutes(layers) + minutes;
    }

}
