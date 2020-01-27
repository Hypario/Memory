package dut.archilog.intro;

import java.util.Iterator;

public class TextualMemory implements Memory<Cell> {
	private int nbRows, nbColumn;

	public TextualMemory(int nbRow, int nbColumn) {
		if (nbRow%2 == 1 && nbColumn%2 == 1) {
			throw new IllegalArgumentException("On ne peut pas jouer avec un nombre impaire de cases");
		}
		this.nbRows=nbRow;
		this.nbColumn=nbColumn;
	}
	
	
	
	@Override
	public Cell createCell(char content) {
		// TODO Auto-generated method stub
		return new Cell(content);
	}

	@Override
	public int getNbPairs() {
		// TODO Auto-generated method stub
		return this.nbRows * this.nbColumn /2 ;
	}

	@Override
	public void prepare(Iterator<Cell> it) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectFirstCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectSecondCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean areCardEquals() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void displayTheTwoCards() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hideTheTwoCards() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isStoppingCriterionMet() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWinner() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

}
