package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	int counter =0;
	public BowlingGame(List<Frame> frames){
		this.frames = frames;
	}
	
	public int addFrame(Frame frame){
		frames.add(frame);
		return counter;
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		//to be implemented
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}

	public boolean CheckGameConsitingOf10Frames() {
		
		return true;
	}
}
