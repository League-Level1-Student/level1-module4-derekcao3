import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JFrame frame;
	JLabel label;

	void GUISetup() {
		frame = new JFrame();
		frame.setSize(500, 200);
		frame.setTitle("Type or Die");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		currentLetter = generateRandomLetter();
		label = new JLabel();
		frame.add(label);
		label.setText(Character.toString(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public static void main(String[] args) {
		TypingTutor yes = new TypingTutor();
		yes.GUISetup();

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar());
		if (arg0.getKeyChar() == currentLetter) {
			System.out.println("correct");
			frame.getContentPane().setBackground(Color.GREEN);
		} else {
			frame.getContentPane().setBackground(Color.RED);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(Character.toString(currentLetter));
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
