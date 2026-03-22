package com.jfs.learn.exercism;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LasagnaTest {

	private Lasagna lasagna;

	@BeforeEach
	void setup() {
		lasagna = new Lasagna();
	}

	@Test
	void expectedMinutesInOvenTest() {
		int expected = 40;
		int actual = lasagna.expectedMinutesInOven();
		assertEquals(expected, actual);
	}

	@Test
	void remainingMinutesInOvenNegativeTest() {
		int expected = 0;
		int actual = lasagna.remainingMinutesInOven(-10);
		assertEquals(expected, actual);
	}

	@Test
	void remainingMinutesInOvenInvalidTest() {
		int expected = 0;
		int actual = lasagna.remainingMinutesInOven(50);
		assertEquals(expected, actual);
	}

	@Test
	void remainingMinutesInOvenTest() {
		int expected = 30;
		int actual = lasagna.remainingMinutesInOven(10);
		assertEquals(expected, actual);
	}

	@Test
	void preparationTimeInMinutesTest() {
		int expected = 10;
		int actual = lasagna.preparationTimeInMinutes(5);
		assertEquals(expected, actual);
	}

	@Test
	void totalTimeInMinutesTest() {
		int expected = 40;
		int actual = lasagna.totalTimeInMinutes(5, 30);
		assertEquals(expected, actual);
	}

}
