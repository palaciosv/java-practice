package replit;

public class Replit_143 {

	public static void printHollowRect() {
		for (int i = 0; i <= 5; i++) {
			if (i == 0) {
				System.out.println("*****");

			}
		}
		for (int j = 0; j < 3; j++) {
			System.out.println("*   *");
		}
		for (int i = 0; i <= 5; i++) {
			if (i == 0) {
				System.out.println("*****");
			}

		}
	}

	public static void main(String[] args) {

		printHollowRect();
	}

}
