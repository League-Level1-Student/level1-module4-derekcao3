import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.glass.events.MouseEvent;

public class ChuckleClicker implements MouseListener  {
	JButton button;
	JButton button2;

void makeButton() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	panel.setSize(20,20);
	frame.add(panel);
	button = new JButton();
	panel.add(button);
	button2 = new JButton();
	panel.add(button2);
	button.setText("joke");
	button2.setText("punchline");
	button.addMouseListener(this);
	button2.addMouseListener(this);
	frame.pack();
}
public static void main(String[] args) {
	ChuckleClicker chuckleclicker = new ChuckleClicker();
	chuckleclicker.makeButton();
	
}

@Override
public void mouseClicked(java.awt.event.MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().equals(button)) {
		JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
	}
	if(e.getSource().equals(button2)) {
		JOptionPane.showMessageDialog(null, "BOTTOM TEXT");
	}
}

@Override
public void mouseEntered(java.awt.event.MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(java.awt.event.MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(java.awt.event.MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(java.awt.event.MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}
