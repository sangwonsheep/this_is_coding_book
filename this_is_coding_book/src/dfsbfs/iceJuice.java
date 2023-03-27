package dfsbfs;

import java.util.Scanner;

public class iceJuice {

	public static int n, m;
	public static int[][] graph = new int[1000][1000];
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		m = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < n; i++) {
			String s = input.nextLine();
			for(int j = 0; j < m; j++) {
				graph[i][j] = s.charAt(j) - '0';
			}
		}
		
		int result = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(dfs(i, j))
					result += 1;
			}
		}
		System.out.println(result);
	}

	public static boolean dfs(int x, int y) {
		if(x <= -1 || x >= n || y <= -1 || y >= m)
			return false;
		
		if(graph[x][y] == 0) {
			graph[x][y] = 1;
			dfs(x-1, y);
			dfs(x+1, y);
			dfs(x, y-1);
			dfs(x, y+1);
			return true;
		}
		return false;
	}
	
}
