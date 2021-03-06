package com.annotations;

public class Level1 {
	static int valuesCounter[];
	public static int[] answer(int[] ary, int count){
		int max = ary[0];
		for (int i = 1; i < ary.length; i++) 
		    if (ary[i] > max) 
		      max = ary[i];	
		valuesCounter = new int[max+1];
		for (int i = 0; i < ary.length; i++)
			valuesCounter[ary[i]]++; 
		int elementsDeleted = 0;
		for (int i = 0; i < valuesCounter.length; i++)
			if(valuesCounter[i] > count)
				{ary[i] = -999;
				elementsDeleted++;}
		
		int[] answerArray = new int[ary.length-elementsDeleted];
		elementsDeleted = 0;
		for (int i = 1; i < ary.length; i++)
			if(ary[i]!=-999)
				answerArray[elementsDeleted++] = ary[i];
		return answerArray;
	}

	public static void main(String[] args) {
		int a[] = answer(new int[]{1, 4, 3, 3, 5, 6, 5, 5, 99, 100}, 2);
		for(int i:a)
			System.out.println(""+i);
	}

}
