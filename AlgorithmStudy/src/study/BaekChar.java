package study;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class BaekChar {

	@Test
	void algo908() {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		sc.close();
		
		String[] aa = a.split("");
		String[] bb = b.split("");
		
		String[] resultA = new String[3];
		String[] resultB = new String[3];
		a="";
		b="";
		
		for(int i = 0; i<3; i++) {
			
			resultA[i] = aa[2-i];
			a += resultA[i]; 
			
			resultB[i] = bb[2-i];
			b += resultB[i]; 
		}
		
		if(Integer.parseInt(a) > Integer.parseInt(b)) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

}
