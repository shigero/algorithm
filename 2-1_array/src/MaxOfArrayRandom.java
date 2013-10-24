import java.util.Random;
import java.util.Scanner;

class MaxOfArrayRandom {

		static int maxOf(int[] a) {
			int max = a[0];
			for (int i = 1; i < a.length; i++) {
				if (a[i] > max) {
					max = a[i];
				}
			}
			return max;
		}
		
	public static void main(String[] args) {
		Random rand = new Random();
//		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("身長の最大値を求めます");
//		int num = stdIn.nextInt();
		int num = 1 + rand.nextInt(10);
		System.out.println("人数は : " + num);
		
		int[] height = new int[num];
		
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
		}
	System.out.println("最大値は " + maxOf(height) + " です。");}
}
