package day02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n; 
		double dou;
		String str;
		
		System.out.print("수 입력 : ");
		n = input.nextInt();
		System.out.println("입력 수 : "+n);
		
		System.out.println("실수 입력 : ");
		dou = input.nextDouble();
		System.out.println("입력 실수 : " + dou);
		
		System.out.print("문자열 입력 : ");
		str = input.next();
		System.out.println("입력 문자열 : " + str);
		
		
	}
}
