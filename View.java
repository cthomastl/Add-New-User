package New;





import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class View  {
		JFrame frame = new JFrame();
	    Date date = new Date();
		JPanel panel = new JPanel();
		JLabel createdByLabel = new JLabel("Username");
		JLabel mainLabel = new JLabel("Add New User");
		JLabel projectNameLabel = new JLabel("Department");
		JLabel passwordLabel = new JLabel("Password");
		JLabel success = new JLabel ("");
		JTextField ceatedByTextField = new JTextField();
		JTextField projectNameTextField = new JTextField();
		JTextField passwordTextField = new JTextField();
		JPasswordField password = new JPasswordField();
		JButton button = new JButton("Submit");
		String createdBy;
		String projectName;
		String adminPassword;
		boolean isActive;
		
		
	
 	public View() {
 		
 	frame.setSize(350,200);
 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	frame.setVisible(true);
 	frame.add(panel);
 	frame.setTitle("HH - Add New Project" );
 	
 	panel.setLayout(null);
 	
 	//****************** Labels *********
 	createdByLabel.setBounds(10,20,80,25);
 	panel.add(createdByLabel);
 	ceatedByTextField.setBounds(100,20,165,25);
 	panel.add(ceatedByTextField);
 	
 	panel.add(mainLabel);
 	mainLabel.setBounds(110, 4, 230, 19);
 	
 	projectNameLabel.setBounds(10,50,80,25);
 	panel.add(projectNameLabel);
 	projectNameTextField.setBounds(100,50,165,25);
 	panel.add(projectNameTextField);
 	
 	passwordLabel.setBounds(10,80,80,25);
 	panel.add(passwordLabel);
 	password.setBounds(100,80,165,25);
 	panel.add(password);
 	
 	success.setBounds(10,100,3000,25);
 	panel.add(success);
 	success.setText("");
 
 	button.setBounds(130,120,80,25);
 	panel.add(button);
 	
 	button.addActionListener(new ActionListener()
 			{
 		public void actionPerformed(ActionEvent e) {
 			createdBy = ceatedByTextField.getText();
 			projectName = projectNameTextField.getText();
 			adminPassword = password.getText();
 			System.out.println("Project Data: \n \n"+"Name: "+createdBy+"\n"+ "Project: "+ projectName + "\n" + "Password: " + adminPassword);
 			
 			if(adminPassword.equals("admin")) {
 				success.setText(projectName+ ":" + createdBy+ " Added Successfully!"+ "and");
 			}
 			else {
 				ceatedByTextField.setText("");
 	 			projectNameTextField.setText("");
 	 			password.setText("");
 	 			success.setText("Oops, Incorrect Password!");
 	 			if(adminPassword.equals("admin")) {
 	 				isActive = true;
 	 			}
 	 			
 	 			}
 		}
 			}
 			
 			);
 	
 	
 	
 	
 	
 	}
 	}
 	

	
