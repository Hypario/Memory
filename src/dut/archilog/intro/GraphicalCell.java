package dut.archilog.intro;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class GraphicalCell extends Cell {

	private final CellButton ui;

	public GraphicalCell(char content) {
		super(content);
		ui = new CellButton(this.toString(), this);
		ui.setPreferredSize(new Dimension(80,80));
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		ui.setText(this.toString());
		if (visible) {
			ui.setBackground(Color.RED);
			ui.setEnabled(false);
		} else {
			ui.setBackground(new JButton().getBackground());
			ui.setEnabled(true);
		}
	}

	public CellButton getUI() {
		return ui;
	}

}
