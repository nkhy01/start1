package java_basic;

import java.util.Scanner;

public class InputFourInt {
	public static void main(String[] args) {
//		4�ڸ� ������ �Է¹޾� �� �ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//
//		���)
//		���� �Է� : 6758
//		4�ڸ� ���� : 6
//		3�ڸ� ���� : 7
//		2�ڸ� ���� : 5
//		1�ڸ� ���� : 8
//		
		
		Scanner scann = new Scanner(System.in);
		
		int allInt = 0;
		int fourthInt = 0;
		int thirdInt = 0;
		int secondInt = 0;
		int firstInt = 0;
		
		
		
		System.out.print("���� �Է�: ");
		allInt= scann.nextInt();
		
		fourthInt = allInt/1000;
		thirdInt = (allInt/100) - (fourthInt*10);
		secondInt = (allInt/10) - ((fourthInt*100)+(thirdInt*10));
		firstInt = allInt - ((fourthInt*1000)+(thirdInt*100)+(secondInt*10));

	
	
		System.out.println("4�ڸ� ����: " + fourthInt);
		System.out.println("3�ڸ� ����: " + thirdInt);
		System.out.println("2�ڸ� ����: " + secondInt);
		System.out.println("1�ڸ� ����: " + firstInt);

		
		
			
	}
}
