package Main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UI {

	GameManager gm;
	
	JFrame window;
	public JTextArea messageText;
	public JPanel bgPanel;
	public Container con;
	public ImageIcon image;
	public JLabel pictureLabel;
	public UI(GameManager gm) {
		
		this.gm = gm;
		
		createMainField();
		createBackground();
		
		
		window.setVisible(true);
	}
	public void createMainField() {
		window = new JFrame();
		window.setSize(1920,1080);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		con= window.getContentPane();
		
		messageText = new JTextArea("World Map");
		messageText.setBounds(600,50,140,30);
		messageText.setBackground(Color.black);
		messageText.setForeground(Color.white);
		messageText.setEditable(false);
		messageText.setLineWrap(true);
		messageText.setWrapStyleWord(true);
		messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 26));
		window.add(messageText);
	}
	public void createBackground() {
		bgPanel = new JPanel();
		bgPanel.setBounds(350,50,1220,930);
		bgPanel.setBackground(Color.blue);
		con.add(bgPanel);
		
		pictureLabel = new JLabel();
		image = new ImageIcon(".//res//game_map.png");
		pictureLabel.setIcon(image);
		bgPanel.add(pictureLabel);
	}
	public void createObject() {
		JLabel objectLabel = new JLabel();
		objectLabel.setBounds(400,150,200,200);
		
		
	}
}
