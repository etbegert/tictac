package ttt;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GUI extends JFrame {

	public GUI() throws HeadlessException {
		super();
	}

	public GUI(GraphicsConfiguration gc) {
		super(gc);
	}

	public GUI(String title) throws HeadlessException {
		super(title);
		this.setSize(400, 400);
		this.setLayout(new GridLayout(3,3));
	}

	public GUI(String title, GraphicsConfiguration gc) {
		super(title, gc);
	}

}
