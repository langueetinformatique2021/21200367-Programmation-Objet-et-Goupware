package atelier02WeiyingZHANG;

/**
 * 
 * @author zhang
 *
 */

public class PairImpair {
	/**
	 * @param v
	 * @return
	 * 
	 */
	public static boolean pair (int v) {
		return((v%2)==0);
	}
	/**
	 * @param v
	 * @return
	 */
		public static boolean impair (int v) {
			return !pair(v);
	
		}
		/**
		 * @param args
		 * 
		 */
		public static void main(String[] args) {
			System.out.println(pair(2));
			System.out.println(impair(10));
		}
}
