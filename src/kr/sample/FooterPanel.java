package kr.sample;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FooterPanel extends JPanel {
	private JButton bt = new JButton("ют╥б");
	private JTextField txt = new JTextField(33);
	
	public FooterPanel() {
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(440, 37));
		add(txt);
		add(bt);
	}
}
