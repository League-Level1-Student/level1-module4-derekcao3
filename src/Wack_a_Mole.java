import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Wack_a_Mole implements MouseListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JLabel label;
	String mole = "mole!";
	Date timeAtStart;
	int hit = 0;
	int count =0;

	public void drawButtons(int buttons) {
		panel.removeAll();
		Random rand = new Random();
		int x = rand.nextInt(24);
		for (int i = 0; i < buttons; i++) {
			if (x == i) {
				button = new JButton();
				button.setText(mole);
				button.addMouseListener(this);
				button.setPreferredSize(new Dimension(100, 25));
				panel.add(button);
			} else {
				button = new JButton();
				button.addMouseListener(this);
				button.setPreferredSize(new Dimension(100, 25));
				panel.add(button);
			}
		}
		panel.revalidate();
	}

	public void CreateUI() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(350, 310);
		panel = new JPanel();
		frame.add(panel);
		JPanel panel2 = new JPanel();
		label = new JLabel();
		frame.add(panel2, BorderLayout.SOUTH);
		panel2.add(label);
		drawButtons(24);
		timeAtStart = new Date();
		timeAtStart.getTime();
	}

	public static void main(String[] args) {
		Wack_a_Mole UI = new Wack_a_Mole();
		UI.CreateUI();

	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
			count +=1;
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("mole!")) {
				label.setText("hit!");
				hit += 1;
			} else {
				label.setText("miss");
			}
			drawButtons(24);
		if(count ==10) {
			endGame(timeAtStart, hit);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}
