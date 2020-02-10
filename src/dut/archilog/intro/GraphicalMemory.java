package dut.archilog.intro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.*;

public class GraphicalMemory implements Memory<GraphicalCell>, ActionListener {

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
        CellButton button;
        while (it.hasNext()) {
            button = it.next().getUI();
            button.addActionListener(this);
            grid.add(button);
        }
        frame.add(grid, BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void selectFirstCard() {
        try {
            while (firstCard == null) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void selectSecondCard() {
        try {
            while (secondCard == null) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean areCardEquals() {
        return firstCard.equals(secondCard);
    }

    @Override
    public void displayTheTwoCards() {
    	firstCard.setVisible(true);
    	secondCard.setVisible(true);
    	nbPairsToFind--;
    }

    @Override
    public void hideTheTwoCards() {
    	firstCard.setVisible(false);
    	secondCard.setVisible(false);
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
    	JOptionPane.showMessageDialog(frame,message);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        CellButton button = (CellButton) actionEvent.getSource();
        button.setBackground(Color.RED);
        Cell cell = button.getCell();
        cell.setVisible(!cell.isVisible());
        if (firstCard == null)
            firstCard = cell;
        else if (secondCard == null)
            secondCard = cell;
        else
            System.err.println("Hoho...il y a un problème...");
    }
}
