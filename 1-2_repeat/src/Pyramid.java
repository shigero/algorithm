import java.util.Scanner;

class Pyramid {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("n: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		spira(n);
	}

	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * (i - 1) + 1; k++) {
				System.out.print("*");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
