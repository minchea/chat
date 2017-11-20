package kr.sample;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	private HeaderPanel headerPanel = new HeaderPanel();
	private BodyPanel bodyPanel = new BodyPanel();
	private FooterPanel footerPanel = new FooterPanel();
	public MainPanel() {
		setLayout(new BorderLayout());
		add(headerPanel, "North");
		add(bodyPanel, "Center");
		add(footerPanel, "South");
	}
}
