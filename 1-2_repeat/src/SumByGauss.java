import java.util.Scanner;

class SumByGauss {
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	System.out.println("Gauss法により、1からnまでの和を求めます。");
	System.out.println("n: ");
	int n = stdIn.nextInt();
	int sum = 0;

	sum = (1 + n) * n / 2;

	System.out.println("1からnまでの和は " + sum + "です");

	}
}
