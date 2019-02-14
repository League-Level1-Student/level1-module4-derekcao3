import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button2 = new JButton();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	panel.setSize(20,20);
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	button.setText("joke");
	button2.setText("punchline");
	frame.pack();

}
}
