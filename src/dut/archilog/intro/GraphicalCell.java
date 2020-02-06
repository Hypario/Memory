package dut.archilog.intro;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class GraphicalCell extends Cell implements ActionListener {

	private final JButton ui;
	
	public GraphicalCell(char content) {
		super(content);
		ui = new JButton(this.toString());
		ui.setPreferredSize(new Dimension(80,80)); 
		ui.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(!isVisible());
		
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
