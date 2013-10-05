import java.util.Scanner;

class SumOf {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a: ");
		int a = stdIn.nextInt();
		System.out.println("b: ");
		int b = stdIn.nextInt();
		int small = 0;
		int large = 0;

		if(a <= b){
			small = a;
			large = b;
		} else {
			small = b;
			large = a;
		}

		System.out.println(a + " から " + b + " までの和は " + sumof(small, large) + "です");
	}

	static int sumof(int a, int b) {
		int sum = 0;
		for (int add = a ; add <= b; add++) {
			sum += add;
		}
		return sum;
	}
}
