import java.util.Scanner;

class SunWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1からnまでの和を求めます。");
		System.out.println("nの値: ");
		int n = stdIn.nextInt();

		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1からnまでの和は " + sum + " です。");
		System.out.println("nは " + i + " です。");

	}
}

