package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testGetFirstThrowWithFirstThrowIs2AndSecondThrowIs4_Return2() {

		Frame frame = new Frame(2,4);
		
		int firstThrow = frame.getFirstThrow();
		
		assertEquals(2, firstThrow);
		
	}
	@Test
	public void testGetSecondThrowWithFirstThrowIs2AndSecondThrowIs4_Return4() {

		Frame frame = new Frame(2,4);
		
		int secondThrow = frame.getSecondThrow();
		
		assertEquals(2, secondThrow);
		
	}

}
