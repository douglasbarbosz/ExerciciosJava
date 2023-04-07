package util;

public class CurrencyConverter {

	public static final double iof = 0.06;
	
	public static double dollarToReal(double dollarValue, double dollarsBought) {
		return dollarValue * dollarsBought * (1.0 + iof);
	}
}
