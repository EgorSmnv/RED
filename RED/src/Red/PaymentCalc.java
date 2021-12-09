package Red;

public class PaymentCalc extends AnnPayment {
	private double mpayment;
	private double overpay;
	public PaymentCalc(int csize, int csrok, double cpercent) {
		mpayment = MounthPayment(csize, csrok, cpercent);
		overpay = overPay(csize, csrok, mpayment);
	}

	public double getMPay() {
		return mpayment;
	}
	
	public double getOverpay() {
		return overpay;
	}
}
