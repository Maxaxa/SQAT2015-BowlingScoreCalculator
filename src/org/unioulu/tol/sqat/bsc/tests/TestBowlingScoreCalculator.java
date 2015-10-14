package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {
	
	private Frame frame;
	
	@Before
	public void setup(){
		frame = new Frame(0,0);
	}

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
		
		assertEquals(4, secondThrow);
		
	}
	
	@Test
	public void testScoreWithFirstThrowIs2AndSecondThrowIs6_Return8(){
		
		Frame frame = new Frame(2,6);
		
		int score = frame.score();
		
		assertEquals(8, score);
	}
	
	@Test
	public void testScoreWithFirstThrowIs0AndSecondThrowIs9_Return9(){
		
		Frame frame = new Frame(0,9);
		
		int score = frame.score();
		
		assertEquals(9, score);
	}
	

}
