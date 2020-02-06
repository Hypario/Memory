package dut.archilog.intro;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class GraphicalCell extends Cell {

	private final JButton ui;
	
	public GraphicalCell(char content) {
		super(content);
		ui = new JButton(this.toString());
		ui.setPreferredSize(new Dimension(80,80)); 
	}
	
	
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		ui.setText(this.toString());
		
	}
	
	public JComponent getUI() {
		return ui;
	}
	
	
}
