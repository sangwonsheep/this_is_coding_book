package dp;

import java.util.Scanner;

public class ant {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int [] k = new int[n];
		
		int [] dp = new int[100];
		
		int max = 0;
		
		for(int i = 0; i < n; i++)
			k[i] = input.nextInt();
		
		dp[0] = k[0];
		dp[1] = Math.max(k[0], k[1]);
		
		for(int i = 2; i < n; i++) {
			dp[i] = Math.max(dp[i-2]+k[i], dp[i-1]);
		}
		System.out.println(dp[n-1]);
	}

}
