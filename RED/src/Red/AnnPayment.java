package Red;

public abstract class AnnPayment {
	public double MounthPayment(int csize, int csrok, double cpercent) {
		//double payment;
		//payment = csize*((cpercent/(100*12))/(1-(Math.pow((1+cpercent/(100*12)),(((csrok*12)-1)*(-1))))));
		Operation payment;
		payment = (a, b, c) -> a*((c/(100*12))/(1-(Math.pow((1+c/(100*12)),(((b*12)-1)*(-1))))));
		double paymentceil = Math.ceil(payment.calc(csize, csrok, cpercent));
		return paymentceil;
	}
	
	public double overPay(int csize, int csrok, double payment) {
		double overpay;
		overpay = payment * csrok * 12 - csize;
		double overpayceil = Math.ceil(overpay);
		return overpayceil;
	}
}
interface Operation{
	double calc(int a, int b, double c);
}