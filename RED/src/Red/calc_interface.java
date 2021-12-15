package Red;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calc_interface {
	private JTextField Price = new JTextField(); 
	private JTextField FirstPay = new JTextField(); 
	private JTextField Time = new JTextField(); 
	private JTextField[] ArrData = {Price, FirstPay, Time}; 
	
	private JTextField CreditSize = new JTextField(); 
	private JTextField MonthPay = new JTextField(); 
	private JTextField OverPay = new JTextField(); 
	
	private JCheckBox Insurence = new JCheckBox("Страхование жизни и здоровья"); 
	private JCheckBox Family = new JCheckBox("Молодая семья"); 
	private JComboBox<String> Goal; 
	private String[] courses = {"Готовое жильё", "Новостройка", "Строительство дома","Загородный дома, земля"}; 
	
	public calc_interface() { 
	
		JFrame a = new JFrame("Calculator"); 
		
		JButton b = new JButton("Рассчитать"); 
		b.setBounds(20,550,200,40); 
		b.addActionListener(new ButtonAction()); 
		a.add(b); 
		 
		 
		Price.setBounds(20,90,200,30); 
		a.add(Price); 
		 
		FirstPay.setBounds(20,150,200,30); 
		a.add(FirstPay); 
		 
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
		 
		Goal = new JComboBox<String>(courses); 
		Goal.setBounds(20,30,200,30); 
		a.add(Goal); 
		 
		JLabel L4 = new JLabel("Цель кредита:"); 
		L4.setBounds(20,0,200,30); 
		a.add(L4); 
		 
		JLabel L5 = new JLabel("Условия снижения процентной ставки:"); 
		L5.setBounds(20,250,400,30); 
		a.add(L5); 
		 
		Insurence.setBounds(20,280,400,30); 
		a.add(Insurence); 
		 
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
		 
		CreditSize.setBounds(20,380,200,30);
		CreditSize.setEditable(false);
		a.add(CreditSize); 
		 
		MonthPay.setBounds(20,440,200,30);
		MonthPay.setEditable(false);
		a.add(MonthPay); 
		 
		OverPay.setBounds(20,500,200,30);
		OverPay.setEditable(false);
		a.add(OverPay); 
		 
		 
		 
		a.setSize(400,650); 
		a.setLayout(null); 
		a.setVisible(true); 
	} 
	 
	public JTextField[] getArray() { 
		return ArrData; 
	} 
	 
	public JCheckBox getInsurence() { 
		return Insurence; 
	} 
	 
	public JCheckBox getFamily() { 
		return Family; 
	} 
	 
	public JComboBox<String> getComboBox() { 
		return Goal; 
	} 
	 
	public String[] getList() { 
		return courses; 
	} 
	
	public void setOutput(String csize, String mpay, String opay) {
		CreditSize.setText(csize);
		MonthPay.setText(mpay);
		OverPay.setText(opay);
	}
	
} 
