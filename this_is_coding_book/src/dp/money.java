package dp;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		int [] array = new int[n];
		int [] dp = new int[m+1];
		
		for(int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		
		for(int i = 0; i < dp.length; i++) {
			dp[i] = 10001;
		}
		
		dp[0] = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = array[i]; j <= m; j++) {
				dp[j] = Math.min(dp[j], dp[j-array[i]]+1);
			}
		}
		if(dp[m] != 10001)
			System.out.println(dp[m]);
		else
			System.out.println("-1");
	}

}
