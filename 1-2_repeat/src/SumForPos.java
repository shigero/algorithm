import java.util.Scanner;

class SumForPos {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);
		int n;
		System.out.println("1からnまでの和を求めます。");

		do {
			System.out.println("n: ");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("1からnまでの和は " + sum + " です。");
	}
}
