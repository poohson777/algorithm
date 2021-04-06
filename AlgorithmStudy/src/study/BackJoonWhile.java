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
	
	@Test
	public void algo10951() {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			
			System.out.println(sc.nextInt() + sc.nextInt());
		}
		
		sc.close();
	}
	
	@Test
	public void algo1110() {
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
			
	}

}
