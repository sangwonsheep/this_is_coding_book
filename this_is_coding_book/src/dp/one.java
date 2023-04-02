package dp;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int [] dp = new int[30001]; // ¿¬»ê È½¼ö
		
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + 1;
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
			}
			if(i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3] + 1);
			}
			if(i % 5 == 0) {
				dp[i] = Math.min(dp[i], dp[i/5] + 1);
			}
		}
		
		System.out.println(dp[n]);
		
	}

}
