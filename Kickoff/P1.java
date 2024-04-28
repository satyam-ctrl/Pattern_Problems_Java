package Kickoff;

public class P1 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while (row <= n) {
			int i = 1;
			while (i <= n) {
				System.out.print("* ");
				i++;
			}
			row++;
			System.out.println();
		}
	}
}
