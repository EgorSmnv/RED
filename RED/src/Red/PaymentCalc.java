package Red;

public class PaymentCalc extends AnnPayment {
	private float mpayment;
	private float overpay;
	int csize;
	int csrok;
	float cpercent;
	public float MonthPaymentCalc(int csize, int csrok, float cpercent) {
		mpayment = MounthPayment(csize, csrok, cpercent);
		return mpayment;
	}
	public float OverpayCalc(int csize, int csrok, float mpayment) {
		overpay = overPay(csize, csrok, mpayment);
		return overpay;
	}
}
