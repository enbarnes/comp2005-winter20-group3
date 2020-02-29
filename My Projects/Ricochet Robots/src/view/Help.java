package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Help extends JFrame implements ActionListener{

	JFrame frmHelp;
	public Help() {
		frmHelp.setResizable(false);
		frmHelp.setTitle("Help");
		frmHelp.setBounds(100, 100, 600, 600);
		frmHelp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmHelp.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setIcon(new ImageIcon(this.getClass().getResource("/Back.png")));
		btnNewButton.setBounds(0, 0, 75, 38);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 40, 444, 231);
		getContentPane().add(lblNewLabel);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Auto-generated method stub
		
	}
}
