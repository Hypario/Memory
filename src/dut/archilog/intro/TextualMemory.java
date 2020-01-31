package dut.archilog.intro;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class TextualMemory implements Memory<Cell> {
	private final int nbRows, nbColumns;

	private final Cell[][] cells;
	private final Scanner in = new Scanner(System.in); // read the input from the keyboard

	private Cell firstCard, secondCard;

	public TextualMemory(int nbRow, int nbColumn) {
		if (nbRow % 2 == 1 && nbColumn % 2 == 1) {
			throw new IllegalArgumentException("On ne peut pas jouer avec un nombre impaire de cases");
		}
		this.nbRows = nbRow;
		this.nbColumns = nbColumn;
		this.cells = new Cell[nbRows][nbColumn];
	}


	@Override
	public Cell createCell(char content) {
		return new Cell(content);
	}

	@Override
	public int getNbPairs() {
		// TODO Auto-generated method stub
		return this.nbRows * this.nbColumns / 2;
	}

	@Override
	public void prepare(Iterator<Cell> it) {
		for (int y = 0; y < cells.length; y++) {
			for (int x = 0; x < (this.cells[y].length); x++) {
				this.cells[y][x] = it.next();
			}
		}
	}

	@Override
	public void selectFirstCard() {
		int x, y;
		do {
			x = 0; y = 0;
			System.out.printf("Quelle carte souhaitez-vous retourner ? 1 <= X <= %d et 1 <= Y <=%d%n", nbColumns, nbRows);
			try {
				x = in.nextInt();
				y = in.nextInt();
			} catch (InputMismatchException err) {
				System.err.println("Ne faites pas n'importe quoi !!");
			}
		} while (x >= 1 || x <= nbColumns || y <= 1 || y >= nbRows);
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
