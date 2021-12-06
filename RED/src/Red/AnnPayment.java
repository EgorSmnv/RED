package Red;

public abstract class AnnPayment {
	public static float MounthPayment(int csize, int csrok, float cpercent) {
		float payment;
		payment = (csize * (cpercent / 12)) / (1 - (1 + cpercent / 12) * (1 - csrok * 12));
		return payment;
	}
	public static float overPay(int csize, int csrok, float mpayment) {
		float overpay;
		overpay = mpayment * csrok * 12 - csize;
		return overpay;
	}
	
}
