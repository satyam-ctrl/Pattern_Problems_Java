package Kickoff;

public class P7 {

	public static void main(String[] args) {
		int n=5;
		int star=1;
		int space=2*n-2;
		int row=1;
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
			star++;
			space-=2;
			row++;
			System.out.println();
		}

	}

}
