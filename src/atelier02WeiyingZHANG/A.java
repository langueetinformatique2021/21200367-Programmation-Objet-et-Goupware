package atelier02WeiyingZHANG;

/**
 * 
 * @author zhang
 *
 */
public class A {
	/**
	 * retourne la valeur true si un entier n passé en paramètre est divisible par 13 (false dans le cas contraire)
	 * 
	 * @param n
	 * @return true si divisible par 13 (false dans le cas contraire)
	 */
	public static boolean treize(int n) {
		return ((n%13) == 0); //意思为n正好能被13整除，%意为取余数。
	}

}
