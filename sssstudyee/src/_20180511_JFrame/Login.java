package _20180511_JFrame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame {
	public static void main(String[] args) {
		JFrame frm = new JFrame("로그인");
		frm.setBounds(120,120,250,150);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2,10,10));
		
		JLabel idLabel = new JLabel("id ", SwingConstants.RIGHT);
		JTextField idText = new JTextField(10);
		panel.add(idLabel);
		panel.add(idText);
		
		JLabel pwLabel = new JLabel("Password ", SwingConstants.RIGHT);
		JPasswordField pwText = new JPasswordField(10);
		panel.add(pwLabel);
		panel.add(pwText);
		
		JButton loginBtn = new JButton("로그인");
		JButton registerBtn = new JButton("회원가입");
		panel.add(loginBtn);
		panel.add(registerBtn);

		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(idText.getText().equals("Hello") && pwText.getText().equals("World")){
					JOptionPane.showMessageDialog(frm, "success");
				}
				else {
					JOptionPane.showMessageDialog(frm, "failed");
				}
				
			}
		});
	frm.add(panel);
	frm.setVisible(true);
	}
}
