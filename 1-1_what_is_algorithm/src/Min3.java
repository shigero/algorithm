
class Min3 {
	static int min3(int a, int b, int c) {
		int min = a;
		if ( b < min ) min = b;
		if ( c < min ) min = c;
		return min;
	}

	public static void main(String[] args) {
		System.out.println("min3(3,2,1) = " + min3(3,2,1));	// a > b > c
		System.out.println("minx(2,1,1) = " + min3(2,1,1));	// a > b = c
		System.out.println("min3(3,1,2) = " + min3(3,1,2));	// a > c > b
		System.out.println("min3(2,1,2) = " + min3(2,1,2));	// a = c > b
		System.out.println("min3(2,1,3) = " + min3(2,1,3));	// c > a > b
		System.out.println("min3(2,2,1) = " + min3(2,2,1));	// a = b > c
		System.out.println("min3(1,1,1) = " + min3(1,1,1));	// a = b = c
		System.out.println("min3(1,1,2) = " + min3(1,1,2));	// c > a = b
		System.out.println("min3(2,3,1) = " + min3(2,3,1));	// b > a > c
		System.out.println("min3(1,2,1) = " + min3(1,2,1));	// b > a = c
		System.out.println("min3(1,3,2) = " + min3(1,3,2));	// b > c > a
		System.out.println("min3(1,2,2) = " + min3(1,2,2));	// b = c > a
		System.out.println("min3(1,2,3) = " + min3(1,2,3));	// c > b > a
	}
}
