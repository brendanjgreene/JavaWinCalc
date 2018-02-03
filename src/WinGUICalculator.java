import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

import java.awt.Panel;

public class WinGUICalculator {
	
	static String n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create Frame for holding calculator
		Frame F = new Frame("Calculations");
		F.setLayout(new BorderLayout(10,10));
		//Create Panel for Text field
		Panel textFieldPanel = new Panel();
		//Create Panel for Buttons and set layout to Grid 4X4
		Panel buttonPanel = new Panel();
		//Left and right bot panel just for creating Space
		Panel leftPanel = new Panel();
		Panel rightPanel = new Panel();
		Panel botPanel = new Panel();
		buttonPanel.setLayout(new GridLayout(4,4,20,20));
		//GridLayout(int rows, int cols, int hgap, int vgap)
		TextField numberField = new TextField(30);
		Font myFont = new Font("Arial", Font.PLAIN, 30);
		
		numberField.setFont(myFont);

		// create math event that passes all the fields and buttons
		MathEvent e1 = new MathEvent(numberField);
		myWEvent f = new myWEvent(F);
		F.addWindowListener(f);
		//add all elements to frame
		F.add(textFieldPanel, BorderLayout.NORTH);
		textFieldPanel.add(numberField);
		F.add(buttonPanel, BorderLayout.CENTER);
		F.add(leftPanel, BorderLayout.WEST);
		F.add(rightPanel, BorderLayout.EAST);
		F.add(botPanel, BorderLayout.SOUTH);
		//add button and action listener for each one
		String[] buttonNames = {
			    "1","2","3","+",
			    "4","5","6","-",
			    "7","8","9","x",
			    "C","0","=","/",
			  };
		for (String s: buttonNames) { 
			Button n = new Button(s);
			n.addActionListener(e1);
			n.addMouseListener(e1);
			buttonPanel.add(n);
			String nLabel=n.getLabel();
			n.setFont(myFont);
			if (nLabel.equals("C")) {
				n.setForeground(Color.RED);
				n.setBackground(Color.RED);
			}else if ((nLabel.equals("+"))||(nLabel.equals("-"))||(nLabel.equals("/"))||(nLabel.equals("x"))){
				n.setForeground(Color.BLUE);
				n.setBackground(Color.BLUE);
			}else if (nLabel.equals("=")) {
				n.setForeground(Color.GREEN);
				n.setBackground(Color.GREEN);
			}

	    }
		// set size of Frame
		F.setBackground(Color.BLACK);
		F.setForeground(null);
		F.setSize(600, 600);
		// set frame to visible
		F.setVisible(true);
		
				

	}

}

		/*Button plusButton = new Button("+");
		Button minusButton = new Button("-");
		Button divideButton = new Button("/");
		Button timesButton = new Button("x");
		Button oneButton = new Button("1");
		Button twoButton = new Button("2");
		Button threeButton = new Button("3");
		Button fourButton = new Button("4");
		Button fiveButton = new Button("5");
		Button sixButton = new Button("6");
		Button sevenButton = new Button("7");
		Button eightButton = new Button("8");
		Button nineButton = new Button("9");
		Button zeroButton = new Button("0");
		Button clearButton = new Button("C");
		Button equalButton = new Button("=");*/

		
		/*plusButton.addActionListener(e1);
		minusButton.addActionListener(e1);
		divideButton.addActionListener(e1);
		timesButton.addActionListener(e1);
		
		/*oneButton.addActionListener(e1);
		twoButton.addActionListener(e1);
		threeButton.addActionListener(e1);
		fourButton.addActionListener(e1);
		
		fiveButton.addActionListener(e1);
		sixButton.addActionListener(e1);
		sevenButton.addActionListener(e1);
		eightButton.addActionListener(e1);
		
		nineButton.addActionListener(e1);
		zeroButton.addActionListener(e1);
		clearButton.addActionListener(e1);
		equalButton.addActionListener(e1);*/

		//first row
		/*buttonPanel.add(oneButton);
		buttonPanel.add(twoButton);
		buttonPanel.add(threeButton);
		buttonPanel.add(plusButton);
		//second row
		/*buttonPanel.add(fourButton);
		buttonPanel.add(fiveButton);
		buttonPanel.add(sixButton);
		buttonPanel.add(minusButton);
		//third row
		/*buttonPanel.add(sevenButton);
		buttonPanel.add(eightButton);
		buttonPanel.add(nineButton);*
		buttonPanel.add(divideButton);
		//fourth row
		buttonPanel.add(clearButton);
		/*buttonPanel.add(zeroButton);
		buttonPanel.add(equalButton);
		buttonPanel.add(timesButton);*/