package java_basic;

import java.util.Scanner;

public class InputFourInt {
	public static void main(String[] args) {
//		4자리 정수를 입력받아 각 자리수를 출력하는 프로그램을 작성하시오
//
//		결과)
//		정수 입력 : 6758
//		4자리 숫자 : 6
//		3자리 숫자 : 7
//		2자리 숫자 : 5
//		1자리 숫자 : 8
//		
		
		Scanner scann = new Scanner(System.in);
		
		int allInt = 0;
		int fourthInt = 0;
		int thirdInt = 0;
		int secondInt = 0;
		int firstInt = 0;
		
		
		
		System.out.print("정수 입력: ");
		allInt= scann.nextInt();
		
		fourthInt = allInt/1000;
		thirdInt = (allInt/100) - (fourthInt*10);
		secondInt = (allInt/10) - ((fourthInt*100)+(thirdInt*10));
		firstInt = allInt - ((fourthInt*1000)+(thirdInt*100)+(secondInt*10));

	
	
		System.out.println("4자리 숫자: " + fourthInt);
		System.out.println("3자리 숫자: " + thirdInt);
		System.out.println("2자리 숫자: " + secondInt);
		System.out.println("1자리 숫자: " + firstInt);

		
		
			
	}
}
