package com.rtetdd.bowling;

import junit.extensions.TestSetup;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ScorerTests {
	Scorer scorerTest;

	@Before
	public void Setup() {
		scorerTest = new Scorer();
	}

	@Test
	public void score_a_zero_au_depart(){
		Assert.assertEquals(0, scorerTest.getScore());
	}

	@Test
	public void getScore_return2_when_2pinsfallen() {
		scorerTest.roll(2);
		Assert.assertEquals(2, scorerTest.getScore());
	}
	
}
