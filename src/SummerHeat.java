import java.util.Scanner;

public class SummerHeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int sum = (c / a) + (d/b);
			System.out.println(sum);
		}
		sc.close();
	}
}
