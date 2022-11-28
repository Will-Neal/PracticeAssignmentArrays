package com.neal.arraypracticeassignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		createIntArray();
//		middleElementOfArray();
//		copyStringArray();
//		practiceArrayIndexLength();
//		printAllButMiddleIndex();
//		swapElementsInStringArray();
//		sortArrayAscending();
//		createMultiPrimitiveArray();
		getUserFavoriteThings();
	}
	
	static void createIntArray() {
		int[] intArray = new int[3];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i+1;
		}
		for (int j = 0; j< intArray.length; j++) {
			System.out.println(intArray[j]);
		}
	}
	
	static void middleElementOfArray() {
		int[] intArray = {13, 5, 7, 68, 2};
		int middleIndex = (int)(intArray.length/2);
		System.out.println(intArray[middleIndex]);
	}
	
	static void copyStringArray() {
		String[] colorsArray = {"Red", "Green", "Blue", "Yellow"};
		String[] newColorArray = colorsArray.clone();
		System.out.println(Arrays.toString(colorsArray));
		System.out.println(Arrays.toString(newColorArray));
	}
	
	static void practiceArrayIndexLength() {
		int[] intArray = {5,2,6,2,1};
		int firstIndex = intArray[0];
		int lastIndex = intArray[intArray.length - 1];
		System.out.println(firstIndex);
		System.out.println(lastIndex);
		//System.out.println(intArray[intArray.length]); //Array out of bounds exception
		//System.out.println(intArray[5]); //Array out of bounds exception
		
	}
	
	static void buildArrayWithLoop() {
		int[] intArray = new int[5];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i;
		}
	}
	
	static void buildArrayWithLoopTimesTwo() {
		int[] intArray = new int[5];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i*2;
		}
	}
	
	static void printAllButMiddleIndex() {
		int[] intArray = {5,2,5,6,7};
		for (int i = 0; i<intArray.length; i++) {
			if (i == (int)intArray.length/2) {
				continue;
			} else {
				System.out.println(intArray[i]);
			}
		}
	}
	
	static void swapElementsInStringArray() {
		String[] stringArray = {"First", "Second", "Third", "Fourth", "Fifth"};
		String stringCopy;
		stringCopy = stringArray[0];
		stringArray[0] = stringArray[2];
		stringArray[2] = stringCopy;
		System.out.println(Arrays.toString(stringArray));
	}
	
	static void sortArrayAscending() {
		int[] unsortedArray = {4,2,9,13,1,0};
		int[] sortedArrayDesc = new int[unsortedArray.length];
		Arrays.sort(unsortedArray);
		System.out.println("Array in ascending order: " + Arrays.toString(unsortedArray));
		System.out.println("The smallest number is: " + unsortedArray[0]);
		System.out.println("The biggest number is: " + unsortedArray[unsortedArray.length - 1]);
	}
	
	static void createMultiPrimitiveArray() {
		Object[] multiPrimitiveArray = new Object[6];
		multiPrimitiveArray[0] = new Integer(2);
		multiPrimitiveArray[1] = new String("Will");
		multiPrimitiveArray[2] = new String("This");
		multiPrimitiveArray[3] = new String("Work??");
		multiPrimitiveArray[4] = new Double(42.0);
		
		System.out.println(Arrays.toString(multiPrimitiveArray));
		System.out.println(multiPrimitiveArray[0] instanceof Integer);
	}
	
	static void getUserFavoriteThings() {
		Scanner userInput = new Scanner(System.in);
		int numThings;
		do {
			System.out.println("How many favorite things do you have?: ");
			while (!userInput.hasNextInt()) {
				System.out.println("Please enter a positive number");
				userInput.next();
			}
		numThings = userInput.nextInt();
		} while (numThings <= 0); 
		String[] favoritesArray = new String[numThings];
		for (int thing = 0; thing < favoritesArray.length; thing++) {
			System.out.println("Enter one of your favorite things: ");
			favoritesArray[thing] = userInput.next();
		}
		System.out.println("Your favorite things are: ");
		System.out.println(Arrays.toString(favoritesArray));
		userInput.close();
	}
}
