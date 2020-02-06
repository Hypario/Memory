package dut.archilog.intro;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicalMemory implements Memory<GraphicalCell> {

	private final int nbRows, nbColumns;

	private final Cell[][] cells;
	private final Scanner in = new Scanner(System.in); // read the input from the keyboard
	private int nbPairsToFind;
	
	private final JFrame frame = new JFrame("Graphical Memory");

	private Cell firstCard, secondCard;

	public GraphicalMemory(int nbRow, int nbColumn) {
		if (nbRow % 2 == 1 && nbColumn % 2 == 1) {
			throw new IllegalArgumentException("On ne peut pas jouer avec un nombre impaire de cases");
		}
		this.nbRows = nbRow;
		this.nbColumns = nbColumn;
		this.cells = new Cell[nbRows][nbColumn];
		nbPairsToFind = getNbPairs();
	}
	
	
	@Override
	public GraphicalCell createCell(char content) {
		return new GraphicalCell(content);
	}

	@Override
	public int getNbPairs() {
		return (nbRows * nbColumns) / 2;
	}

	@Override
	public void prepare(Iterator<GraphicalCell> it) {
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(nbRows, nbColumns));
		//System.err.println("This is a fake game !");
		while (it.hasNext()) {
			grid.add(it.next().getUI());
			
		}
		frame.add(grid, BorderLayout.CENTER);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void selectFirstCard() {
	}

	@Override
	public void selectSecondCard() {
	}

	@Override
	public boolean areCardEquals() {
		return false;
	}

	@Override
	public void displayTheTwoCards() {
	}

	@Override
	public void hideTheTwoCards() {
	}

	@Override
	public boolean isStoppingCriterionMet() {
		return nbPairsToFind == 0;
	}

	@Override
	public boolean isWinner() {
		return true;
	}

	@Override
	public void displayMessage(String message) {
	}


}
