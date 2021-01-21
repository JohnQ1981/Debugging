package debuggingtutorial;

public class PerfectSquareCounter {


	static int evenPerfectSquareCounter = 0;

	public static void main(String[] args) {

		/*
		 Create a method to count perfect square and even perfect square numbers from 1 to 100
	 4 is a perfect square because square root of 4 is integer
	 Perfect Squares: 1, 4, 9, 16, 25, ..., 100
		 */

		//		isPerfectSquare(9);
		//		System.out.println(isPerfectSquare(8));
		System.out.println("Total perfect squares: "+calculateCount(100));
		System.out.println("Total even perfect squares: "+evenPerfectSquareCounter);



	}

	public static int calculateCount(int num) {

		int perfectSquareCounter =0;

		for(int i=1; i<=num; i++) {

			if(isPerfectSquare(i)) {
				perfectSquareCounter++;
				if(i%2==0) {
					++evenPerfectSquareCounter;
					//System.out.println(i+"--"+evenPerfectSquareCounter);
				}
			}

		}
		return perfectSquareCounter;

	}
	private static boolean isPerfectSquare(int number) {

		double sqrt = Math.sqrt(number);

		double result = Math.floor(sqrt);
		return sqrt - result ==0;


	}

}
