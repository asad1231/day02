package day02;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		int kor;
		int eng;
		int mat;
		int sum;
		
		System.out.print("당신의 이름은 무엇입니까?");
		name = input.next();
		System.out.print("홍길동 님의 국어점수 : ");
		kor = input.nextInt();
		System.out.print("홍길동 님의 영어점수 : ");
		eng = input.nextInt();
		System.out.print("홍길동 님의 수학점수 : ");
		mat = input.nextInt();
		
		sum = kor + eng + mat;
		
		System.out.println("================");
		System.out.println("이름 : " + name);
		System.out.println("================");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("================");
		System.out.println("합계 : " + sum);
		System.out.println("================");
		
	}
}
