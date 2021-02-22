package com.bae.dogscomp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoggoCompetitionTest {

	@Test
	public void testDogList() {
		DoggoCompetition doggo = new DoggoCompetition();
		String result = doggo.dogPosition(5);
		System.out.println(result);

		assertEquals(false, result.contains(" 5th"));
	}

}
