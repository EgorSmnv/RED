package Red;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import Red.PaymentCalc;

public class ButtonAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JTextField[] ArrData = Main.gui.getArray(); 
		String TextPrice = ArrData[0].getText(); 
		String TextFirst = ArrData[1].getText(); 
		String TextTime = ArrData[2].getText(); 
		 
		int price = 0; 
		int firstpay=0; 
		int time=0; 
		 
		boolean err = false;
		
		try {
			price = Integer.parseInt(TextPrice); 
			firstpay = Integer.parseInt(TextFirst); 
			time = Integer.parseInt(TextTime); 
		} 
		catch(NumberFormatException nfe) 
		{ 
			Main.gui.setOutput("Error", "Error", "Error");
			err = true;
		}
		
		if (err == false) {
			
			double percent = 10;  
			 
			JComboBox<String> combo = Main.gui.getComboBox(); 
			String item = (String)combo.getSelectedItem(); 
			String[] courses = Main.gui.getList(); 
			 
			if(item == courses[0]) { 
			    percent = 9.2; 
			} 
			 
			if(item == courses[1]) { 
				percent = 9.2; 
			} 
			 
			if(item == courses[2]) { 
				percent = 9.9; 
			} 
			 
			if(item == courses[3]) { 
				percent = 9.3; 
			} 
			
			JCheckBox InsurenceCheck = Main.gui.getInsurence(); 
			JCheckBox FamilyCheck = Main.gui.getFamily(); 
			 
			if(InsurenceCheck.isSelected() && !(FamilyCheck.isSelected())) { 
			    percent = percent - 1.0; 
			} 
			 
			if(FamilyCheck.isSelected() && !(InsurenceCheck.isSelected())) { 
	            percent = percent - 1.0; 
			}
			if(FamilyCheck.isSelected() && InsurenceCheck.isSelected()) { 
	            percent = percent - 2.0; 
			}
			 
			 
			int creditsize = price - firstpay;
			String Textcreditsize = Integer.toString(creditsize); 
			PaymentCalc MPay = new PaymentCalc(creditsize, time, percent); 
			double monthpay = MPay.getMPay(); 
			//PaymentCalc OPay = new PaymentCalc(price, time, percent);
			double overpay = MPay.getOverpay();
			/*String OverPayText = Double.toString(monthpay);
			String MPayText = Double.toString(overpay);*/
			String OverPayText = String.format("%.0f",overpay);
			String MPayText = String.format("%.0f",monthpay);
			/*Main.gui.OverPay.setText(MPayText);
			Main.gui.CreditSize.setText(Textcreditsize);
			Main.gui.MonthPay.setText(OverPayText);*/
			Main.gui.setOutput(Textcreditsize, MPayText, OverPayText);
		}
	}
}
