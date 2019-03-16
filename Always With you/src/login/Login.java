package login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame{
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;
	private static final int FRAME_X_ORIGIN = 400;
	private static final int FRAME_Y_ORIGIN = 200;
	
	public static void main(String[] args) {
		new Login().login_interface();
	}
	public void login_interface() {
		this.setTitle("Always With You");
		JPanel panel = new JPanel();
		JButton login = new JButton("登录");
		JButton register = new JButton("注册");
		JTextField userFrame = new JTextField(10);
		JTextField secretFrame = new JTextField(10);
		JLabel user = new JLabel("用户名：");
		JLabel secret = new JLabel("   密码：");
		panel.setLayout(null);
		Font title = new Font("宋体",Font.PLAIN,20);
	    Font suit = new Font("宋体",Font.PLAIN,15);
		user.setFont(suit);
		secret.setFont(suit);
		login.setFont(suit);
		register.setFont(suit);
		
		panel.add(user);
		user.setBounds(150,60,100,30);
		
		panel.add(userFrame);
		userFrame.setBounds(220, 60, 150, 30);
		
		panel.add(secret);
		secret.setBounds(150, 100, 100, 30);
		
		panel.add(secretFrame);
		secretFrame.setBounds(220, 100, 150, 30);
		
		//panel.add(register);
		panel.add(register);
		register.setBounds(150,140,60,30);
		
		panel.add(login);
		login.setBounds(300, 140, 60, 30);
		JFrame frame = new JFrame();
		/*frame.add(user);
		frame.add(userFrame);
		frame.add(secret);
		frame.add(secretFrame);
		frame.add(register);
		frame.add(login);*/
		frame .getContentPane().add(BorderLayout.CENTER, panel);
		//frame.getContentPane().add(user);
		frame.setBounds(FRAME_X_ORIGIN, FRAME_Y_ORIGIN, FRAME_WIDTH, FRAME_HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
