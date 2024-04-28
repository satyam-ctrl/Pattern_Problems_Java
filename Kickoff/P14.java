package Kickoff;

public class P14 {

	public static void main(String[] args) {
		int n=5;
		int star=5;
		int space=-1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			if(row==1) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			space+=2;
			star--;
			row++;
			System.out.println();
		}
	}
}
