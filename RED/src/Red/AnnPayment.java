package Red;

public abstract class AnnPayment {
	public float MounthPayment(int csize, int csrok, float cpercent) {
		float payment;
		payment = (csize * (cpercent / 12)) / (1 - (1 + cpercent / 12) * (1 - csrok * 12));
		return payment;
	}
	public float overPay(int csize, int csrok, float payment) {
		float overpay;
		overpay = payment * csrok * 12 - csize;
		return overpay;
	}
	
}
