import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Slot implements MouseListener, Runnable {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Slot());
	}

	private void spinReels() {
		// clear reels panel
		// call spinReel for each real
		// check for win
		// revalidate the reels panel
	}

	private int spinReel() {
		// get random value 0..2
		// load image label based on random #
		// add label to reels panel
		// return random #
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(800, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel top = new JPanel();
		frame.add(top, BorderLayout.NORTH);
		JPanel mid = new JPanel();
		frame.add(mid, BorderLayout.CENTER);
		JPanel bot = new JPanel();
		frame.add(bot, BorderLayout.SOUTH);
		JLabel label = new JLabel();
		label.setText("Spin to play");
		top.add(label);
		JButton button = new JButton();
		bot.add(button);
		button.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("BOTTOM TEXT");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
