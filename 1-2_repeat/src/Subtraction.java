import java.util.Scanner;

class Subtraction {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a: ");
		int a = stdIn.nextInt();
		System.out.print("b: ");
		int b = stdIn.nextInt();

		while (a >= b) {
			System.out.println("b は aより大きい値を入力してください。");
			System.out.print("b: ");
			b = stdIn.nextInt();
		}

		System.out.println("b -a: " + subtract(a, b));
	}

	static int subtract(int a, int b) {
		return b - a;
	}
}
