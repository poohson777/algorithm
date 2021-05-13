package study;

import java.util.Scanner;
import java.util.StringTokenizer;

import org.junit.jupiter.api.Test;

class BaekChar {

	@Test
	void algo2908() {

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
	
	@Test
	void algo1316() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = "";
		int idx = 0;
		int result = 0;
		
		for(int i = 0; i<num; i++) {
			
			str += sc.next();
			
		}
		sc.close();
		
		String[] arr = str.split("");
		
		for(int i = 0; i< arr.length; i++) {
			
			if(arr[i].equals(arr[i+1]) && i !=arr.length-1 ) {
				idx++;
			}else if( i < arr.length-1){
				idx=0;
			}
			
			result = result+idx;
			
		}
		
		System.out.println(result);
	}
	
	@Test
	void algo1152() {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		sc.close();
		
		StringTokenizer st = new StringTokenizer(a, " ");
		
		System.out.println(st.countTokens());
		
	}
	
	@Test
	void algo11654() {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.next().charAt(0);
		
		System.out.println(num);
		
		sc.close();
	}
	
	@Test
	void algo11720() {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		String num = sc.next();
		
		String[] arr = new String[cnt];
		arr = num.split("");
		
		int result = 0;
		
		for (int i = 0; i < cnt; i++) {
			
			result += Integer.parseInt(arr[i]);
		}
		sc.close();
		System.out.println(result);
	}
	

}
