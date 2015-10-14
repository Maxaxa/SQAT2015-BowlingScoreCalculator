package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//the score of a single frame
	public int score(){
		int score = getFirstThrow() + getSecondThrow();
		return score;
	}

	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}

	public void setSecondThrow(int secondThrow) {
		this.secondThrow = secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(getFirstThrow()==10 && getSecondThrow()==0){
		return true;
		}else{
			return false;
		}
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(score()==10 && getFirstThrow < 10 && getFirstThrow >1){ //more is necessarz
			return true;
			}else{
				return false;
			}
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
}
