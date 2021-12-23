package Red;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.synth.ColorType;

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
		b.setBounds(55,550,200,40); 
		b.addActionListener(new ButtonAction()); 
		a.add(b); 
		 
		 
		Price.setBounds(30,90,250,30); 
		a.add(Price); 
		 
		FirstPay.setBounds(30,150,250,30); 
		a.add(FirstPay); 
		 
		Time.setBounds(30,210,250,30); 
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
		Goal.setBounds(30,30,250,30); 
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
		
		JLabel L9 = new JLabel("<html> <font color=#777777>Разработка: <font/> <html/>"); 
		L9.setBounds(20,605,400,30);
		a.add(L9); 
		
		JLabel L10 = new JLabel("<html> <font color=#777777>Семенов Е.Б. <font/> <html/>"); 
		L10.setBounds(25,630,400,30); 
		a.add(L10); 
		
		JLabel L11 = new JLabel("<html> <font color=#777777>Зачетная книжка: 19130102<font/> <html/>"); 
		L11.setBounds(25,645,400,30); 
		a.add(L11); 
		
		JLabel L12 = new JLabel("<html> <font color=#777777>Аюпов Р.М.<font/> <html/>"); 
		L12.setBounds(25,670,400,30); 
		a.add(L12); 
		
		JLabel L13 = new JLabel("<html> <font color=#777777>Зачетная книжка: 19130546<font/> <html/>"); 
		L13.setBounds(25,685,400,30); 
		a.add(L13); 
		
		JLabel L14 = new JLabel("<html> <font color=#777777>Прохоров Д.А.<font/> <html/>"); 
		L14.setBounds(25,710,400,30); 
		a.add(L14); 
		
		JLabel L15 = new JLabel("<html> <font color=#777777>Зачетная книжка: 19130108<font/> <html/>"); 
		L15.setBounds(25,725,400,30); 
		a.add(L15); 
		 
		CreditSize.setBounds(30,380,250,30);
		CreditSize.setEditable(false);
		a.add(CreditSize); 
		 
		MonthPay.setBounds(30,440,250,30);
		MonthPay.setEditable(false);
		a.add(MonthPay); 
		 
		OverPay.setBounds(30,500,250,30);
		OverPay.setEditable(false);
		a.add(OverPay); 
		
		
		 
		a.setSize(310,800); 
		a.setLayout(null); 
		a.setVisible(true);
		a.setResizable(false);
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
