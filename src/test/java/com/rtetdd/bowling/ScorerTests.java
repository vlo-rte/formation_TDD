package com.rtetdd.bowling;

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

	@Test
	public void getScore_afterTwoThrowsWith3and4() {
		scorerTest.roll(3);
		scorerTest.roll(4);
		Assert.assertEquals(7, scorerTest.getScore());
	}

	@Test
	public void getScore_AfterOneFrameOpenOf7_FirstThrow5() {

		//given
		scorerTest.setIndexFrame(1);
		scorerTest.setScore(7);

		//when
		scorerTest.roll(5);

		//then
		Assert.assertEquals(12, scorerTest.getScore());
	}

	@Test
	public void getScore_AfterSpare() {
		//given
		scorerTest.setIndexFrame(1);
		scorerTest.setSpare(true);
		scorerTest.setScore(10);

		//when
		scorerTest.roll(4);
		scorerTest.roll(2);

		//then
		Assert.assertEquals(20, scorerTest.getScore());
		//Assert.assertEquals(2, scorerTest.getIndexFrame());
	}
}
