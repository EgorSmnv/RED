package Red;

public abstract class monthly_payment_calc {
	int credit_srok;
	int credit_size;
	float credit_percent;
	float monthly_payment = (credit_size * (credit_percent / 12)) / (1 - (1 + credit_percent / 12) * (1 - credit_srok * 12));
}
