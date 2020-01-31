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
		do {
			firstCard = askCard();
		} while (firstCard.isVisible());
		firstCard.setVisible(true);
	}

	@Override
	public void selectSecondCard() {
		do {
			secondCard = askCard();
		} while (secondCard.isVisible() || secondCard == firstCard);
		secondCard.setVisible(true);
		System.out.println(this);
	}

	@Override
	public boolean areCardEquals() {
		return firstCard.equals(secondCard);
	}

	@Override
	public void displayTheTwoCards() {
		firstCard.setVisible(true);
		secondCard.setVisible(true);
	}

	@Override
	public void hideTheTwoCards() {
		firstCard.setVisible(false);
		secondCard.setVisible(false);
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
		System.out.println(message);
	}

	/**
	 * Retourne l'entier qu'à taper l'utilisateur
	 * @return int
	 */
	private int nextInt() {
		try {
			return in.nextInt();
		} catch (InputMismatchException err) {
			System.err.println("Ne faites pas n'importe quoi !!");
			in.next();
		}
		return 0;
	}

	private Cell askCard() {
		int x, y;
		do {
			System.out.println(this);
			System.out.printf("Quelle carte souhaitez-vous retourner ? 1 <= X <= %d et 1 <= Y <=%d%n", nbColumns, nbRows);
			x = nextInt();
			y = nextInt();
		} while (x < 1 || x > nbColumns || y < 1 || y > nbRows);
		return cells[y - 1][x - 1];
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Cell[] cell : cells) {
			for (Cell value : cell) {
				stringBuilder.append(value);
			}
			stringBuilder.append(System.lineSeparator());
		}
		return stringBuilder.toString();
	}

}
