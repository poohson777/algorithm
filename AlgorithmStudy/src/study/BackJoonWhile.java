package study;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class BackJoonWhile {

	@Test
	public void algo10952() {
		
		Scanner sc = new Scanner(System.in);
		
		int last = 1;
		
		while(last != 0) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0 && b==0) {
				last = 0;
			}else {
				
				System.out.println(a+b);
			}
			
		}
		sc.close();
		
	}

}
