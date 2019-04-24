import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Slot implements MouseListener, Runnable {

	JPanel mid;
	JLabel label;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Slot());
	}

	private void spinReels() {
		// clear reels panel
		mid.removeAll();
		// call spinReel for each real

		int reel = spinReel();
		int reel2 = spinReel();
		int reel3 = spinReel();
		// check for win
		if(reel == reel2 && reel == reel3) {
			label.setText("You win");
		}
		else {
			label.setText("You lose");
		}
		// revalidate the reels panel
		mid.revalidate();
	}

	private int spinReel() {
		// get random value 0..2
		Random rand = new Random();

		int random = rand.nextInt(3);
		// load image label based on random #
		if (random == 0) {
			try {
				mid.add(createLabelImage("diamond.jpg"));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		// add label to reels panel
		if (random == 1) {
			try {
				mid.add(createLabelImage("iron.png"));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		if (random == 2) {
			try {
				mid.add(createLabelImage("emerald.png"));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		// return random #
		return random;
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
		mid = new JPanel();
		mid.setBackground(Color.WHITE);
		frame.add(mid, BorderLayout.CENTER);
		JPanel bot = new JPanel();
		frame.add(bot, BorderLayout.SOUTH);
		label = new JLabel();
		label.setText("Spin to play");
		top.add(label);
		JButton button = new JButton();
		bot.add(button);
		button.setText("Spin");
		button.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Spin!");
		spinReels();
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

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

}
