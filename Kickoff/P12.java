package Kickoff;
public class P12 {
	public static void main(String[] args) {
		int n = 7;
		int star = 4;
		int space = -1;
		int row = 1;
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if(row==1 || row==n) {
				k=2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			if (row <= n / 2) {
				space += 2;
				star--;
			} else {
				space -= 2;
				star++;
			}
			row++;
			System.out.println();
		}
	}
}
