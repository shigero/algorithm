import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("左下直角三角形を描画します。");

		do {
			System.out.print("段数n: ");
			n = stdIn.nextInt();
		} while (n <=0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
