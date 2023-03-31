package dp;

import java.util.Scanner;

public class gold {

	static int [][] array = new int[21][21];
	static int [][] dp = new int[21][21];
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int T = input.nextInt();

		for(int tc = 0; tc < T; tc++) {
			int n = input.nextInt();
			int m = input.nextInt();
			
			int result = 0;
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					array[i][j] = input.nextInt();
				}
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					dp[i][j] = array[i][j];
				}
			}
			
			for(int j = 1; j < m; j++) {
				for(int i = 0; i < n; i++) {
					if(i == 0) {
						dp[i][j] = array[i][j] + Math.max(dp[i][j-1], dp[i+1][j-1]);
					}
					else if(i == n-1) {
						dp[i][j] = array[i][j] + Math.max(dp[i][j-1], dp[i-1][j-1]);
					}
					else {
						dp[i][j] = array[i][j] + Math.max(dp[i-1][j-1], Math.max(dp[i][j-1], dp[i+1][j-1]));
					}
					if(j == m-1) {
						if(result < dp[i][j]) {
							result = dp[i][j];
						}
					}
						
				}
			}
			System.out.println(result);
		}
	}

}
