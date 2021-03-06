package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class InGameHelp extends JFrame implements ActionListener {

	JFrame frmHelp;
	JLabel background; 
	public InGameHelp() {
		frmHelp = new JFrame();
		frmHelp.setTitle("Help");
		frmHelp.setBounds(100, 100, 600, 600);
		frmHelp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		ImageIcon img=new ImageIcon(this.getClass().getResource("/pages.jpg"));
		
		JButton btnBack= new JButton("Back");
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHelp.setVisible(false);
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setIcon(new ImageIcon(this.getClass().getResource("/back.png")));
		btnBack.setBounds(10, 11, 108, 28);
		frmHelp.getContentPane().add(btnBack);
		
		JLabel lblTitle = new JLabel("Ricochet Robots Rules");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(218, 15, 167, 21);
		frmHelp.getContentPane().add(lblTitle);
		
		//Background has to be the last, if not the other components won't show
		frmHelp.getContentPane().setLayout(null);
		background = new JLabel("",img,JLabel.CENTER);;
		background.setBounds(0, 44, 584, 517);
		frmHelp.getContentPane().add(background);
		
		JScrollPane scroll = new JScrollPane(background, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(0, 44, 584, 517);
		frmHelp.getContentPane().add(scroll);
		
		frmHelp.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// This is a required method
		
	}
}

