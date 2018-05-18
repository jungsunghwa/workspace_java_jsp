package _20180518_JFrame;

import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener{
	Container container = getContentPane();
	JLabel userLabel = new JLabel("ID");
	JLabel passLabel = new JLabel("PW");
	JTextField userText = new JTextField();
	JPasswordField passField = new JPasswordField();
	JButton btnLogin = new JButton("로그인");
	JButton btnReset = new JButton("초기화");
	JCheckBox showPass = new JCheckBox("비번 보이기");
	
	LoginFrame(){
		 setTitle("로그인 대화상자");
		 setVisible(true);
		 setBounds(10,10,350,300);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setLayoutManager();
		 setLocationAndSize();
		 addComPonentsToContainer();
		 addActionEvent();
	}
	 
	public void addActionEvent() {
		btnLogin.addActionListener(this);
		btnReset.addActionListener(this);
		showPass.addActionListener(this);
	}

	private void setLocationAndSize() {
		userLabel.setBounds(50,50,100,30);
		passLabel.setBounds(50,120,100,30);
		userText.setBounds(150,50,100,30);
		passField.setBounds(150,120,100,30);
		btnLogin.setBounds(150,150,100,30);
		btnReset.setBounds(50,200,100,30);
		showPass.setBounds(200,200,100,30);
	}
	
	private void addComPonentsToContainer() {		
		container.add(userLabel);
		container.add(passLabel);
		container.add(userText);
		container.add(passField);
		container.add(btnLogin);
		container.add(btnReset);
		container.add(showPass);
	}

	public void setLayoutManager() {
		container.setLayout(null);
	}

	public static void main(String[] args) {
		LoginFrame frame = new LoginFrame();
	}
	 @Override
	 public void actionPerformed(ActionEvent e){
		 if(e.getSource() == btnLogin){
			 String idText;
			 String pwdText;
			 idText = userText.getText();
			 pwdText = String.valueOf(passField.getPassword());
			 if(idText.equalsIgnoreCase("dgsw") && pwdText.equalsIgnoreCase("1234")) {
				 JOptionPane.showMessageDialog(userText, "로그인 성공");
			 }
			 else {
				 JOptionPane.showMessageDialog(userText, "로그인 실패");
			 }
		 }
		 if(e.getSource() == btnReset){ 
			 userText.setText("");
			 passField.setText("");
		 }
		 if(e.getSource() == showPass){
			 if(showPass.isSelected()){
				 passField.setEchoChar('\0');
			 } else {
				 passField.setEchoChar('\u25CF');
			 }
		 }
	 }
	 
	 
}
