package Red;

public class PaymentCalc extends AnnPayment {
	private float mpayment;
	private float overpay;
	int csize;
	int csrok;
	float cpercent;
	public PaymentCalc(int csize, int csrok, float cpercent) {
		mpayment = MounthPayment(csize, csrok, cpercent);
		overpay = overPay(csize, csrok, mpayment);
	}

	public float getMPay() {
		return mpayment;
	}
	
	public float getOverpay() {
		return overpay;
	}
}
