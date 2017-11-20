package kr.sample;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BodyPanel extends JPanel{
	private JTextArea ta = new JTextArea(35, 40);
	public BodyPanel() {
		setBackground(Color.gray);
		add(ta);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		add(new JScrollPane(ta));
	}
}
