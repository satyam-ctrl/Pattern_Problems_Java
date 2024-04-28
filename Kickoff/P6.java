package Kickoff;

public class P6 {

	public static void main(String[] args) {
		int n=5;
		int star=5;
		int row=1;
		int space=0;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			space+=2;
			star--;
			row++;
			System.out.println();
		}

	}

}
