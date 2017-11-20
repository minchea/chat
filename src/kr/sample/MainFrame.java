package kr.sample;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private MainPanel mainPanel = new MainPanel();
	public MainFrame() {
		setSize(440, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
		add(mainPanel);
		pack();
	}
}