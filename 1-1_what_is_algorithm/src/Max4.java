import java.util.Scanner;

class Max4 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if ( b > max ) max = b;
		if ( c > max ) max = c;
		if ( d > max ) max = d;
		return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("4つの整数の最大値を表示します");
		System.out.println("a = "); int a = stdIn.nextInt();
		System.out.println("b = "); int b = stdIn.nextInt();
		System.out.println("c = "); int c = stdIn.nextInt();
		System.out.println("d = "); int d = stdIn.nextInt();

		System.out.println("最大値は " + max4(a, b, c, d) + " です。");
	}

}
