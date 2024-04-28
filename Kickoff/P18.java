package Kickoff;

public class P18 {

	public static void main(String[] args) {
		int n = 5;
		int space = 0;
		int star = 5;
		int row = 1;
		while (row <= 2 * n - 1) {
			int i = 1;
			while (i <= space) {
				System.out.print("   ");
				i++;
			}
			int k = 1;
			while (k <= star) {
				System.out.print(" * ");
				k++;
			}
			if (row < n) {
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			row++;
			System.out.println();
		}
	}
}
