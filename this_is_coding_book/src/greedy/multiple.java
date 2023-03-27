package greedy;

import java.util.Scanner;

public class multiple {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		String [] str = s.split("");
		
		int result = Integer.parseInt(str[0]);
		
		for(int i = 1; i < str.length; i++) {
			int n = Integer.parseInt(str[i]);
			if(result <= 1 || n <= 1) {
				result += n;
			}
			else {
				result *= n;
			}
		}
		
		System.out.println(result);
		
	}

}
