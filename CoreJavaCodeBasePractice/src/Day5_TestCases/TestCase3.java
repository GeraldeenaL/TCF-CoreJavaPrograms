package Day5_TestCases;

import java.util.Scanner;

public class TestCase3 {
	public static void main(String[] args) {
		System.out.println("Enter the Number:    ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int l=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1) {
					if(i==1)
						System.out.print(j+" ");
					else															
			            System.out.print(i+" ");
				}
				else if(j==n) {
					m--;
					System.out.print(m+" ");
				}
				else if(i==n) {					
					l--;
					System.out.print(l+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
}
