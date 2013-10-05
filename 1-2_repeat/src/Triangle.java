import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("段数n: ");
			n = stdIn.nextInt();
		} while (n <=0);
		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
	}

	static void triangleLB(int n){
		System.out.println("左下直角三角形を描画します。");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleLU(int n){
		System.out.println("左上直角三角形を描画します。");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleRU(int n){
		System.out.println("右上5直角三角形を描画します。");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= n - i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
