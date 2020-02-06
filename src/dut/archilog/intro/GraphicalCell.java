package dut.archilog.intro;

import java.awt.Dimension;

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
	}

	public CellButton getUI() {
		return ui;
	}

}
