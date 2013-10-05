
public class Multi99TableEx {
	public static void main(String[] args) {
		String label1 = "   |";
		String label2 = "---+";
		for (int i = 1; i <= 9; i++) {
			label1 += "  " + i;
			label2 += "---";
		}
		System.out.println(label1);
		System.out.println(label2);

		for (int i = 1; i <= 9; i++) {
			System.out.print(" " + i + " |");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}
}
