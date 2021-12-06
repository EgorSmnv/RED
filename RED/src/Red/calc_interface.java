package Red;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calc_interface {
	public JTextField Price = new JTextField();
	public JTextField FirstPay = new JTextField();
	public JTextField Time = new JTextField();
	public JTextField[] ArrData = {Price, FirstPay, Time};
	public JTextField CreditSize = new JTextField();
	public JTextField MonthPay = new JTextField();
	public JTextField OverPay = new JTextField();
	public calc_interface() {
	JFrame a = new JFrame("Calculator");
	JButton b = new JButton("Рассчитать");
	b.setBounds(20,550,200,40);
	b.addActionListener(new ButtonAction());
	a.add(b);
	//
	
	
	Price = new JTextField();
	Price.setBounds(20,90,200,30);
	a.add(Price);
	
	FirstPay = new JTextField();
	FirstPay.setBounds(20,150,200,30);
	a.add(FirstPay);
	
	Time = new JTextField();
	Time.setBounds(20,210,200,30);
	a.add(Time);
	
	JLabel L1 = new JLabel("Стоимость недвижимости:");
	L1.setBounds(20,60,200,30);
	a.add(L1);
	
	JLabel L2 = new JLabel("Первоначальный взнос:");
	L2.setBounds(20,120,200,30);
	a.add(L2);

	JLabel L3 = new JLabel("Срок:");
	L3.setBounds(20,180,200,30);
	a.add(L3);
	
	String courses[]= {"Новостройка", "Вторичное жилье", "Готовое жилье", "Строительство дома","Загородный дома, земля"};
	JComboBox Goal = new JComboBox(courses);
	Goal.setBounds(20,30,200,30);
	a.add(Goal);
	
	JLabel L4 = new JLabel("Цель кредита:");
	L4.setBounds(20,0,200,30);
	a.add(L4);
	
	JLabel L5 = new JLabel("Условия снижения процентной ставки:");
	L5.setBounds(20,250,400,30);
	a.add(L5);

	JCheckBox Insurence = new JCheckBox("Страхование жизни и здоровья");
	Insurence.setBounds(20,280,400,30);
	a.add(Insurence);
	
	JCheckBox Family = new JCheckBox("Молодая семья");
	Family.setBounds(20,310,400,30);
	a.add(Family);
	
	JLabel L6 = new JLabel("Размер кредита:");
	L6.setBounds(20,350,200,30);
	a.add(L6);
	
	JLabel L7 = new JLabel("Ежемесечная выплата:");
	L7.setBounds(20,410,200,30);
	a.add(L7);
	
	JLabel L8 = new JLabel("Переплата:");
	L8.setBounds(20,470,200,30);
	a.add(L8);
	
	CreditSize = new JTextField(Price.getText());
	CreditSize.setBounds(20,380,200,30);
	a.add(CreditSize);
	
	MonthPay = new JTextField();
	MonthPay.setBounds(20,440,200,30);
	a.add(MonthPay);
	
	OverPay = new JTextField();
	OverPay.setBounds(20,500,200,30);
	a.add(OverPay);
	
	
	
	a.setSize(400,650);
	a.setLayout(null);
	a.setVisible(true);
	}
	public JTextField getTextPrice() {
		return Price;
	}
	public JTextField getTextFirst() {
		return FirstPay;
	}
	public JTextField getTextTime() {
		return Time;
	}
	
}
