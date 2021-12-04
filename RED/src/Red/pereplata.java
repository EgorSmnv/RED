package Red;

public abstract class pereplata {
	int credit_size;
	int credit_srok;
	float monthly_payment;
	float payment_size = monthly_payment * credit_srok * 12 - credit_size;
}
