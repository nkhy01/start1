package java_basic;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		int fourthInt = 0;
		fourthInt = scann.nextInt();
		
		int thirdInt = 0;
		thirdInt = scann.nextInt();
	
		int secondInt = 0;
		secondInt = scann.nextInt();

		int firstInt = 0;
		firstInt = scann.nextInt();

		

//		System.out.printf("���� �Է�: %d%d%d%d", fourthInt, thirdInt, secondInt, firstInt);
		System.out.println("4�ڸ� ����: " + fourthInt);
		System.out.println("3�ڸ� ����: " + thirdInt);
		System.out.println("2�ڸ� ����: " + secondInt);
		System.out.println("1�ڸ� ����: " + firstInt);

	}

}
