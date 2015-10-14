package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {
	
	private Frame frame;
	private BowlingGame game;
	
	@Before
	public void setupFrame(){
		frame = new Frame(0,0);
	}
	@Before
	public void setupGame(){
		List<Frame> frames = new ArrayList<Frame>();
		game = new BowlingGame(frames);
		game.addFrame(new Frame(1,5));
		game.addFrame(new Frame(3,6));
		game.addFrame(new Frame(7,2));
		game.addFrame(new Frame(3,6));
		game.addFrame(new Frame(4,4));
		game.addFrame(new Frame(5,3));
		game.addFrame(new Frame(3,3));
		game.addFrame(new Frame(4,5));
		game.addFrame(new Frame(8,1));
		game.addFrame(new Frame(2,6));
	}
	

	@Test
	public void testGetFirstThrowWithFirstThrowIs2AndSecondThrowIs4_Return2() {

		frame.setFirstThrow(2);
		frame.setSecondThrow(4);
		
		int firstThrow = frame.getFirstThrow();
		
		assertEquals(2, firstThrow);
		
	}
	
	@Test
	public void testGetSecondThrowWithFirstThrowIs2AndSecondThrowIs4_Return4() {

		frame.setFirstThrow(2);
		frame.setSecondThrow(4);
		
		int secondThrow = frame.getSecondThrow();
		
		assertEquals(4, secondThrow);
		
	}
	
	@Test
	public void testScoreWithFirstThrowIs2AndSecondThrowIs6_Return8(){
		
		frame.setFirstThrow(2);
		frame.setSecondThrow(6);;
		
		int score = frame.score();
		
		assertEquals(8, score);
	}
	
	@Test
	public void testScoreWithFirstThrowIs0AndSecondThrowIs9_Return9(){
		
		frame.setFirstThrow(0);
		frame.setSecondThrow(9);
		
		int score = frame.score();
		
		assertEquals(9, score);
	}
	
	@Test
	public void testAddFrame_FirstThrowIs1_SecondThrowIs5(){
		List<Frame> frames = new ArrayList<Frame>();
		BowlingGame game = new BowlingGame(frames);
		
		frame.setFirstThrow(1);
		frame.setSecondThrow(5);
		
		
		game.addFrame(frame);
		//System.out.println(frames.get(0).getFirstThrow());
		assertEquals(1, frames.get(0).getFirstThrow());
	}
	
	@Test
	public void testCheckGameConsitingOf10Frames_10Frames_ReturnTrue(){
		
		
		assertEquals(true, game.CheckGameConsitingOf10Frames(game.frames));
	}
	
	@Test
	public void testCheckGameConsitingOf10Frames_2Frames_ReturnTrue(){
		List<Frame> frames = new ArrayList<Frame>();
		BowlingGame game = new BowlingGame(frames);
		game.addFrame(new Frame(1,5));
		game.addFrame(new Frame(3,6));
		
		
		assertEquals(false, game.CheckGameConsitingOf10Frames(frames));
	}
	
	@Test
	public void testScoreOfTheGameWithStandardFramesAsArrayList_Return81(){
		
		int gameScore = game.score();
		
		assertEquals(81,gameScore);
	}
	
	@Test
	public void testScoreOfTheGameWithDefinedFramesAsArrayList_Return6(){
		List<Frame> definedframes = new ArrayList<Frame>();
		game = new BowlingGame(definedframes);
		game.addFrame(new Frame(1,5));
		int gameScore = game.score();
		
		assertEquals(6,gameScore);
	}
	
	@Test
	public void testIsStrikeWithFirstThrowIs10SecondThrowIs0_ReturnTrue(){
		frame.setFirstThrow(10);
		frame.setSecondThrow(0);
		
		assertEquals(true,frame.isStrike());
	}
	
	@Test
	public void testIsStrikeWithFirstThrowIs3SecondThrowIs6_ReturnTrue(){
		frame.setFirstThrow(3);
		frame.setSecondThrow(6);
		
		assertEquals(false,frame.isStrike());
	}
	@Test
	public void testScoreWithStrike_Return10(){
		frame.setFirstThrow(10);
		frame.setSecondThrow(0);
		
		assertEquals(10,frame.score());
	}

}
