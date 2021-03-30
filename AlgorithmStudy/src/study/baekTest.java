package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.junit.jupiter.api.Test;


class baekTest {
	

	@Test
	public void test1() {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		in.close();
		
		String str = (a>b)? ">" : ((a<b)? "<" : "==");
		
		System.out.println(str);
		
	}

	@Test
	public void test2() {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		in.close();
		
		String score = "F";
		
		if(a>=90) {
			score = "A";
		}else if(a>=80) {
			score = "B";
		}else if(a>=70) {
			score = "C";
		}else if(a>=60) {
			score = "D";
		}
		
		
		System.out.println(score);
	}
	
	@Test
	public void gugudan() {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		in.close();
		
		for(int a = 1; a<10; a++) {
			
			System.out.println(num + " * " + a + " = " + num*a);
		}
		
	}
	
	@Test
	public void gugu() {
		
		for(int i = 1; i<10; i++) {
			for(int j = 2; j <10; j++) {
				
				System.out.println(j +" * "+i +" = " + i * j);
			}
			 System.out.println();
		}
	}
	
	@Test
	public void algo2753() {
		
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		scan.close();
		
		int result = 0;
		
		if( year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			
			result = 1;
		}
		
		System.out.println(result);
		
	}
	
	@Test
	public void algo14681() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		int result;
		
		if(num1 > 0 && num2 > 0) {
			
			result = 1;
		}else if(num1 <0 && num2 >0) {
			result = 2;
		}else if(num1 <0 && num2 <0) {
			result = 3;
		}else {
			result = 4;
		}
		
		System.out.println(result);
		
	}
	
	
	@Test
	public void algo10950() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇번 돌기?");
		int T = sc.nextInt();
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0; i< T; i++) {
			
			
			System.out.println("숫자 두 개 입력");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.println(num1 + num2);
			
		}
		
		sc.close();
		
	}
	
	@Test
	public void algo8393() {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		int result = 0;
		
		for(int i = 1; i<= num; i++) {
			
			result = result+i;
		}
		
		System.out.println(result);
		
	}
	
	@Test
	public void algo15552() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			StringTokenizer st;
			
			for(int i = 0; i < num; i++) {
				st = new StringTokenizer(br.readLine()," ");
				bw.write( (Integer.parseInt(st.nextToken())+ (Integer.parseInt(st.nextToken()) ))+"\n");
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void algo11021() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			StringTokenizer st;
			
			for(int i = 1; i<=num; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				bw.write("Case #"+i+": " +( Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) +"\n"); 
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void algo11022() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			StringTokenizer st;
			
			int a = 0;
			int b = 0;
			
			for(int i = 1; i<=num; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				a= Integer.parseInt(st.nextToken());
				b= Integer.parseInt(st.nextToken());
				
				bw.write("Case #"+i+": " +a + " + "+b + " = "+(a+b) +"\n"); 
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void algo10871() {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int a[] = new int[N];
		
		for(int i = 0; i< N; i++) {
			
			a[i] = sc.nextInt();
			
			if(a[i] < X) {
				System.out.print(a[i] + " ");
			}
		}
		
		sc.close();
	}
	
	@Test
	public void algo10871_2() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			
			
			int arr[] = new int[N];
			st = new StringTokenizer(br.readLine() ," ");
			
			for(int i = 0; i< N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				
				if(arr[i] < X) {
					bw.write(arr[i] + " ");
				}
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
