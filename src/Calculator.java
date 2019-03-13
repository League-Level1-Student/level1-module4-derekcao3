
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
	JButton add;
	JButton subtract;
	JButton multiply;
	JButton divide;
	JTextField textField;
	JTextField textField2;
	JLabel label;
	double answer;

	public void createUI() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3, 1));
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		frame.add(panel2);
		frame.add(panel);
		frame.add(panel3);
		add = new JButton();
		add.setText("add");
		textField = new JTextField(10);
		textField2 = new JTextField(10);
		label = new JLabel();
		panel2.add(textField);
		panel2.add(textField2);
		subtract = new JButton();
		subtract.setText("subtract");
		multiply = new JButton();
		multiply.setText("multiply");
		divide = new JButton();
		divide.setText("divide");
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		label.setText("");
		panel3.add(label);
		add.addMouseListener(this);
		subtract.addMouseListener(this);
		multiply.addMouseListener(this);
		divide.addMouseListener(this);
		frame.pack();

	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String text = textField.getText();
		double number1 = Double.parseDouble(text);
		String text2 = textField2.getText();
		double number2 = Double.parseDouble(text2);
		if (e.getSource().equals(add)) {
			answer = number1 + number2;
			label.setText(answer + "");
		}
		if (e.getSource().equals(subtract)) {
			answer = number1 - number2;
			label.setText(answer + "");

		}
		if (e.getSource().equals(multiply)) {
			answer = number1 * number2;
			label.setText(answer + "");
		}
		if (e.getSource().equals(divide)) {
			answer = number1 / number2;
			label.setText(answer + "");
		}
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