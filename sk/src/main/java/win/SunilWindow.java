package win;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SunilWindow {

	private JFrame frame;
	private JTextField nametbox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SunilWindow window = new SunilWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SunilWindow() {
		initialize();
	}

private void addtomysql()
{
	
}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 722, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton savebtn = new JButton("Save");
		savebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s = nametbox.getText();
				
				
				JOptionPane.showMessageDialog(null, s);
			}
		});
		savebtn.setBounds(252, 118, 89, 23);
		frame.getContentPane().add(savebtn);
		
		nametbox = new JTextField();
		nametbox.setBounds(252, 65, 133, 20);
		frame.getContentPane().add(nametbox);
		nametbox.setColumns(10);
	}
}
