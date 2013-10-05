import java.util.Scanner;

class Degit {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n: ");
		int n = stdIn.nextInt();

		while (n <= 0){
			System.out.print("n: ");
			n = stdIn.nextInt();
		}

		System.out.println("桁数: " + getDigit(n));
	}

	static int getDigit(int n) {
		return Integer.toString(n).length();
	}
}
