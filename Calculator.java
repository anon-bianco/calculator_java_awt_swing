import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	JLabel displayLabel;
	JButton zeroButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton clearButton;
	JButton divisionButton;
	JButton multiplicationButton;
	JButton additionButton;
	JButton subtractionButton;
	JButton equalsButton;
	JButton decimalButton;
	
	boolean isOperatorClicked = false;
	boolean isAdditionOperator = false;
	boolean isSubtractionOperator = false;
	boolean isMultiplicationOperator = false;
	boolean isDivisionOperator = false;
	
	double oldValue;
	double newValue;
	double result;
	
	public Calculator() {
		
		
		//window
		JFrame jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//calculator screen
		displayLabel = new JLabel();
		displayLabel.setBounds(30, 50, 530, 50);
		displayLabel.setBackground(Color.BLACK);
		displayLabel.setForeground(Color.WHITE);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(displayLabel);
		
		//buttons
		//7 8 9 division clear
		sevenButton = new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.setBackground(Color.YELLOW);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.setBackground(Color.YELLOW);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.setBackground(Color.YELLOW);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		divisionButton = new JButton("/");
		divisionButton.setBounds(330, 130, 80, 80);
		divisionButton.setBackground(Color.GRAY);
		divisionButton.addActionListener(this);
		jf.add(divisionButton);
		
		clearButton = new JButton("CE");
		clearButton.setBounds(430, 130, 130, 80);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		//4 5 6 multiplication
		fourButton = new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.setBackground(Color.YELLOW);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setBackground(Color.YELLOW);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.setBackground(Color.YELLOW);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		multiplicationButton = new JButton("x");
		multiplicationButton.setBounds(330, 230, 80, 80);
		multiplicationButton.setBackground(Color.GRAY);
		multiplicationButton.addActionListener(this);
		jf.add(multiplicationButton);
		
		//1 2 3 subtraction
		oneButton = new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.setBackground(Color.YELLOW);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.setBackground(Color.YELLOW);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.setBackground(Color.YELLOW);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		subtractionButton = new JButton("-");
		subtractionButton.setBounds(330, 330, 80, 80);
		subtractionButton.setBackground(Color.GRAY);
		subtractionButton.addActionListener(this);
		jf.add(subtractionButton);
		
		// . 0 = +
		decimalButton = new JButton(".");
		decimalButton.setBounds(30, 430, 80, 80);
		decimalButton.setBackground(Color.YELLOW);
		decimalButton.addActionListener(this);
		jf.add(decimalButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.setBackground(Color.YELLOW);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalsButton = new JButton("=");
		equalsButton.setBounds(230, 430, 80, 80);
		equalsButton.setBackground(Color.YELLOW);
		equalsButton.addActionListener(this);
		jf.add(equalsButton);
		
		additionButton = new JButton("+");
		additionButton.setBounds(330, 430, 80, 80);
		additionButton.setBackground(Color.GRAY);
		additionButton.addActionListener(this);
		jf.add(additionButton);
		
	}
	
	public static void main(String[] args) {
		
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText() + "0");
			}
		} 
		else if(e.getSource()==oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText() + "1");
			}
		} 
		else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText() + "2");
			}
		} 
		else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText() + "3");
			}
		} 
		else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText() + "4");
			}
		} 
		else if(e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText() + "5");
			}
		} 
		else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText() + "6");
			}
		} 
		else if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText() + "7");
			}
		} 
		else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText() + "8");
			}
		} 
		else if(e.getSource()==nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText() + "9");
			}
		}
		else if(e.getSource()==divisionButton){
			oldValue = Double.parseDouble(displayLabel.getText());
			isOperatorClicked = true;
			isDivisionOperator = true;
		} 
		else if(e.getSource()==multiplicationButton){
			oldValue = Double.parseDouble(displayLabel.getText());
			isOperatorClicked = true;
			isMultiplicationOperator = true;
		} 
		else if(e.getSource()==subtractionButton){
			oldValue = Double.parseDouble(displayLabel.getText());
			isOperatorClicked = true;
			isSubtractionOperator = true;
		} 
		else if(e.getSource()==additionButton){
			oldValue = Double.parseDouble(displayLabel.getText());
			isOperatorClicked = true;
			isAdditionOperator = true;
		} 
		else if(e.getSource()==decimalButton){
			displayLabel.setText(displayLabel.getText() + ".");
			
		} 
		else if(e.getSource()==equalsButton){
			if(isAdditionOperator) {
				newValue = Double.parseDouble(displayLabel.getText());
				result = oldValue + newValue;
				displayLabel.setText(""+result);
				isAdditionOperator = false;
			}
			else if(isSubtractionOperator){
				newValue = Double.parseDouble(displayLabel.getText());
				result = oldValue - newValue;
				displayLabel.setText(""+result);
				isSubtractionOperator = false;
			}
			else if(isMultiplicationOperator){
				newValue = Double.parseDouble(displayLabel.getText());
				result = oldValue * newValue;
				displayLabel.setText(""+result);
				isMultiplicationOperator = false;
			}
			else if(isDivisionOperator){
				newValue = Double.parseDouble(displayLabel.getText());
				result = oldValue / newValue;
				displayLabel.setText(""+result);
				isDivisionOperator = false;
			}
		}
		else if(e.getSource()==clearButton) {
			displayLabel.setText("");
		}
		
		
		
	}
}
