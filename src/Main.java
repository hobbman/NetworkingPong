import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Pong Game");
		frame.setPreferredSize(new Dimension(300,300));
		frame.setLayout(new BorderLayout());
		PongPanel pongPanel = new PongPanel();
		frame.add(pongPanel, BorderLayout.CENTER);
		//frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setBackground(Color.GRAY);
	}

}
