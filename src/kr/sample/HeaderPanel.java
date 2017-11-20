package kr.sample;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import kr.sample.user.User;
import kr.sample.user.UserController;

public class HeaderPanel extends JPanel{
	private JLabel userPanel = new JLabel();
	private UserController userController = new UserController();
	private User user;
	public HeaderPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(440, 30));
		user = new User(userController.createID());
		userPanel.setText(user.getId());
		add(userPanel);
	}
}
