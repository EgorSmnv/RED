package Red;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButtonAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField Price = Main.gui.getTextPrice();
		String TextPrice = Price.getText();
		Main.gui.CreditSize.setText(TextPrice);
		
		JTextField FirstPay = Main.gui.getTextFirst();
		String TextFirst = FirstPay.getText();
		Main.gui.MonthPay.setText(TextFirst);
		
		JTextField Time = Main.gui.getTextTime();
		String TextTime = Time.getText();
		Main.gui.OverPay.setText(TextTime);

	}

}
