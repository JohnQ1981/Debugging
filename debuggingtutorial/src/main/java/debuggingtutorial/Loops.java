package debuggingtutorial;

public class Loops {

	public static void main(String[] args) {

		loop1();


	}

	public static void loop1() {
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		loop2();
		loop3();
	}

	private static void loop2() {
		int i=1;
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}	
	}

	private static void loop3() {
		int i=1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=10);		
	}

}
