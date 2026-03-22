package com.jfs.learn.exercism;

public class Lasagna {

	private int MINUTES = 40;
	private int MINUTES_PER_LAYER = 2;

	public int expectedMinutesInOven() {
		return MINUTES;
	}

	public int remainingMinutesInOven(int minutes) {
		if (minutes < 0 || (expectedMinutesInOven() - minutes) < 0)
			return 0;

		return expectedMinutesInOven() - minutes;
	}

	public int preparationTimeInMinutes(int layers) {
		return layers * MINUTES_PER_LAYER;
	}

	public int totalTimeInMinutes(int layers, int minutes) {
		return preparationTimeInMinutes(layers) + minutes;
	}

}
