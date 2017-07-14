package ttt;

import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class Square extends JButton {

	private int x, y, state;
	
	public Square(int xPos, int yPos) {
		x = xPos;
		y = yPos;
		state = 0;
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
}
