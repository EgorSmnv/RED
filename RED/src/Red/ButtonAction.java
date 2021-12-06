package Red;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

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
		
		float percent = 10;
		String creditsize = Integer.toString(price - firstpay);
		PaymentCalc MPay = new PaymentCalc(price, time, percent);
		
		float monthpay = MPay.getMPay();
		PaymentCalc OPay = new PaymentCalc(price, time, percent);
		float overpay = OPay.getOverpay();
		String OverPayText = Float.toString(monthpay);
		String MPayText = Float.toString(overpay);
		Main.gui.OverPay.setText(MPayText);
		Main.gui.CreditSize.setText(creditsize);
		Main.gui.MonthPay.setText(OverPayText);
		
		
		
	}

}
