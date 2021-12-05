package Red;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButtonAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField Price = Main.gui.getTextField();
		String text1 = Price.getText();
		System.out.println(text1);

	}

}
