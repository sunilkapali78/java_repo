package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Domain.User;
import services.UserService;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import net.proteanit.sql.DbUtils;

public class Entry {

	private JFrame frame;
	private JTextField nametext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entry window = new Entry();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Entry() {
		initialize();
		GetAllUsers();
	}

	
	public void GetAllUsers()
	{
		ResultSet rs= service.getusers();
		table.setModel(DbUtils.resultSetToTableModel(rs));
	}
	
        UserService service= new UserService();
        private JTable table;
        private JScrollPane scrollPane;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		nametext = new JTextField();
		nametext.setBounds(300, 45, 86, 20);
		frame.getContentPane().add(nametext);
		nametext.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name= nametext.getText();
				User u= new User();
				u.Name=name;
				//u.setName(name);
				service.addUser(u);
			}
		});
		btnNewButton.setBounds(300, 98, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 28, 233, 178);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
