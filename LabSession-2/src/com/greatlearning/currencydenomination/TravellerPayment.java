package com.greatlearning.currencydenomination;

import java.util.Scanner;

public class TravellerPayment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations: ");
		int size = sc.nextInt();
		
		int[] currency = new int[size];
		
		System.out.println("Enter the currency denominations value: ");
		for(int i=0; i<size; i++) {
			currency[i]=sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay: ");
		int requiredAmount = sc.nextInt();
		
//		System.out.println("UnSorted currency denominations: ");
//		for(int i=0; i<size; i++) {
//			System.out.print(currency[i]+", ");
//		}
//		System.out.println(" ");
		
		MergeSort ms = new MergeSort();
		ms.sortArray(currency, 0, size-1);
		
//		System.out.println("Sorted currency denominations: ");
//		for(int i=0; i<size; i++) {
//			System.out.print(currency[i]+", ");
//		}
//		System.out.println(" ");
		
		if(requiredAmount>0) {
			int totalAmount=0;
			int amount = requiredAmount;
			
			System.out.println("Your payment approach in order to give min no of notes will be: ");
			
			for(int i=0; i<size; i++) {			
				int count = amount/currency[i];			
				if(count!=0)
					System.out.println(currency[i]+": "+count);	
				
				amount = amount%currency[i];
				
				int currentTotal = count*currency[i];
				totalAmount += currentTotal;
				
				if(totalAmount==requiredAmount)
					break;	
			}
		}
		else {
			System.out.println("Please enter Valid amount");
		}
		
		sc.close();
	}

}
