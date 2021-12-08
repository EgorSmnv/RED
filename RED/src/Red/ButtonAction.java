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
		 
		try { 
		price = Integer.parseInt(TextPrice); 
		firstpay = Integer.parseInt(TextFirst); 
		time = Integer.parseInt(TextTime); 
		} 
		catch(NumberFormatException nfe) 
		{ 
		Main.gui.OverPay.setText("Error"); 
		Main.gui.CreditSize.setText("Error"); 
		Main.gui.MonthPay.setText("Error"); 
		} 
		
		JCheckBox InsurenceCheck = Main.gui.getInsurence(); 
		JCheckBox FamilyCheck = Main.gui.getFamily(); 
		 
		if(InsurenceCheck.isSelected()) { 
		System.out.println("Insurence is selected"); 
		} 
		 
		if(FamilyCheck.isSelected()) { 
		System.out.println("Family is selected"); 
		} 
		 
		JComboBox<String> combo = Main.gui.getComboBox(); 
		String item = (String)combo.getSelectedItem(); 
		String[] courses = Main.gui.getList(); 
		 
		if(item == courses[0]) { 
		System.out.println(courses[0]); 
		} 
		 
		if(item == courses[1]) { 
		System.out.println(courses[1]); 
		} 
		 
		if(item == courses[2]) { 
		System.out.println(courses[2]); 
		} 
		 
		if(item == courses[3]) { 
		System.out.println(courses[3]); 
		} 
		 
		if(item == courses[4]) { 
		System.out.println(courses[4]); 
		} 
		 
		//float percent = 10; 
		//String creditsize = Integer.toString(price - firstpay); 
		//PaymentCalc MPay = new PaymentCalc(price, time, percent); 
		 
		//float monthpay = MPay.getMPay(); 
		//PaymentCalc OPay = new PaymentCalc(price, time, percent); 
		//float overpay = OPay.getOverpay(); 
		//String OverPayText = Float.toString(monthpay); 
		//String MPayText = Float.toString(overpay); 
		//main.gui.OverPay.setText(MPayText); 
		//main.gui.CreditSize.setText(creditsize); 
		//main.gui.MonthPay.setText(OverPayText); 
		 
		 
		
		}  

		}
