package com.greatlearning.paymoney;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array: ");		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the array values: ");		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved: ");
		int numberOfTargets = sc.nextInt();
		
		while(numberOfTargets--!=0) {
			System.out.println("Enter the value of target: ");
			long target = sc.nextInt();
			
			long sum=0;
			boolean flag = false;
			
			for(int i=0; i<size; i++) {
				sum += arr[i];
				if(sum>=target) {
					System.out.println("Target achieved after "+(i+1)+" transactions");
					flag = true;
					break;
				}
			}
			
			if(flag!=true) {
				System.out.println("Given target is not achieved");
			}
		}
		
		sc.close();		
	}
}
