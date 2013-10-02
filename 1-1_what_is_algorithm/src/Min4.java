import java.util.Scanner;

class Min4 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if ( b < min ) min = b;
		if ( c < min ) min = c;
		if ( d < min ) min = d;
		return min;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("4つの整数の最大値を表示します");
		System.out.println("a = "); int a = stdIn.nextInt();
		System.out.println("b = "); int b = stdIn.nextInt();
		System.out.println("c = "); int c = stdIn.nextInt();
		System.out.println("d = "); int d = stdIn.nextInt();

		System.out.println("最大値は " + min4(a, b, c, d) + " です。");
	}

}