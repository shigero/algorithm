import java.util.Scanner;

class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);

		System.out.println("1からnまでの和を求めます。");
		System.out.println("n: ");
		int n = stdIn.nextInt();

		int sum = 0;
		String leftEq = "";
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.print(i + " + ");
		}

		System.out.println("= " + sum);
		System.out.println("1からnまでの和は " + sum + " です。");
	}
}
