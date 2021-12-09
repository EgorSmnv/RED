package Red;

public abstract class AnnPayment {
	public double MounthPayment(int csize, int csrok, double cpercent) {
		double payment;
		payment = csize*((cpercent/(100*12))/(1-(Math.pow((1+cpercent/(100*12)),(((csrok*12)-1)*(-1))))));
		double paymentceil = Math.ceil(payment);
		return paymentceil;
	}
	
	public double overPay(int csize, int csrok, double payment) {
		double overpay;
		overpay = payment * csrok * 12 - csize;
		double overpayceil = Math.ceil(overpay);
		return overpayceil;
	}
	
}
