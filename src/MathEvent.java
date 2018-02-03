import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MathEvent implements ActionListener, ItemListener, MouseListener{
	
		// Initialize temporary String field values
		TextField localResultTextField;
		float firstNum;
		String opt;
		
		// Initialize temporary button
		Button localButton;
		private Object n;
		public MathEvent(TextField numberField) {
			localResultTextField=numberField;
			}
		@Override
		public void actionPerformed(ActionEvent e1) {
			// TODO Auto-generated method stub
			Button eventSourceBTN = (Button) e1.getSource();
			String eventLabel=eventSourceBTN.getLabel();
			if (eventLabel.equals("C")) {
				localResultTextField.setText("");
			}else if(eventLabel.equals("+")||eventLabel.equals("-")||eventLabel.equals("x")||eventLabel.equals("/")){
				firstNum=Float.parseFloat(localResultTextField.getText());
				localResultTextField.setText("");
				opt=eventLabel;
			}else if(eventLabel.equals("=")){
				if(opt.equals("+")) {
					localResultTextField.setText(Float.toString(firstNum+(Float.parseFloat(localResultTextField.getText()))));
				}if(opt.equals("-")) {
					localResultTextField.setText(Float.toString(firstNum-(Float.parseFloat(localResultTextField.getText()))));
				}if(opt.equals("/")) {
					System.out.println("local field after / calle"+localResultTextField.getText());
					String zero=localResultTextField.getText();
					System.out.println("string   "+zero);
					localResultTextField.setText(Float.toString(firstNum/(Float.parseFloat(localResultTextField.getText()))));
					if (zero.equals("0")) {
						
						localResultTextField.setText("You cannot divide by zero");
						System.out.println("if reached");
					}
					
				}if(opt.equals("x")) {
					localResultTextField.setText(Float.toString(firstNum*(Float.parseFloat(localResultTextField.getText()))));
				}	
			}else {
				String addText = localResultTextField.getText()+eventLabel;
				localResultTextField.setText(addText);
			}
			
		}
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e1) {
			// TODO Auto-generated method stub
			n = e1.getSource();
			Font myFontBold = new Font("Arial", Font.BOLD, 100);
			((Component) n).setFont(myFontBold);
			((Component) n).setForeground(Color.YELLOW);
			((Component) n).setBackground(Color.RED);
			
		}
		@Override
		public void mouseExited(MouseEvent e1) {
			// TODO Auto-generated method stub
			Button n= (Button) e1.getSource();
			Font myFont = new Font("Arial", Font.PLAIN, 30);
			n.setFont(myFont);
			((Component) n).setForeground(null);
			((Component) n).setBackground(null);
			String nLabel=n.getLabel();
			if (nLabel.equals("C")) {
				n.setForeground(Color.RED);
				n.setBackground(Color.RED);
			}else if ((nLabel.equals("+"))||(nLabel.equals("-"))||(nLabel.equals("/"))||(nLabel.equals("x"))){
				n.setForeground(Color.BLUE);
				n.setBackground(Color.BLUE);
			}else if (nLabel.equals("=")) {
				n.setForeground(Color.GREEN);
				n.setBackground(Color.GREEN);
				String zero=localResultTextField.getText();
				if (zero.equals("You cannot divide by zero")) {
					
					localResultTextField.setText("");
					System.out.println("= left");
				}
			}
			
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


