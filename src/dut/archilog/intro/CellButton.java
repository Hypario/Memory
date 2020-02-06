package dut.archilog.intro;

import javax.swing.*;

public class CellButton extends JButton {

    private final GraphicalCell cell;

    CellButton(String content, GraphicalCell cell) {
        super(content);
        this.cell = cell;
    }

    public GraphicalCell getCell() {
        return cell;
    }

}
