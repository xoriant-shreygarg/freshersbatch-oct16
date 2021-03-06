package com.enums;

class ElementIndices{
	
	private int number;
	private int indices[];
	private int counter;

	public ElementIndices(int number, int length,int index) {
		super();
		this.number = number;
		this.indices = new int[length];
		counter = 0;
		this.indices[counter++] = index;
	}

	public int getNumber() {
		return number;
	}
	
	public int getCounter() {
		return counter;
	}

	public void addIndex(int index) {
		this.indices[counter++] = index;
	}
	
}

public class Level1 {
	
	static ElementIndices[] list; 
	static int counter = 0;
	
	public static void incrementElementCounter(int number, int length, int index){
		for (int i = 0; i < counter; i++) {
			if(number == list[i].getNumber()) {
				list[i].addIndex(index);
				return;
			}
		}
		list[counter++] = new ElementIndices(number,length,index);
		return;
	}

	public static int[] answer(int[] ary, int threshold) {
		int numberOfElementsDeleted = 0;
		list = new ElementIndices[ary.length];
		for (int i = 0; i < ary.length; i++)
			incrementElementCounter(ary[i], ary.length,i);
		for (int i = 0; i < counter; i++) {
			if(list[i].getCounter()>threshold)
				for (int j = 0; j < ary.length; j++)
					if(ary[j]==list[i].getNumber())
						{ary[j] = -999;
						numberOfElementsDeleted++;}
		}
		int[] answerArray = new int[ary.length-numberOfElementsDeleted];
		int answerCounter = 0;
		for (int i = 0; i < ary.length; i++) {
			if(ary[i]!=-999)
				answerArray[answerCounter++] = ary[i];
		}
		return answerArray;
/*
		int max = ary[0];
		for (int i = 1; i < ary.length; i++)
			if (ary[i] > max)
				max = ary[i];
		int valuesCounter[] = new int[max + 1];
		for (int i = 0; i < ary.length; i++)
			valuesCounter[ary[i]]++;
		int numberOfElementsDeleted = 0;
		for (int i = 0; i < valuesCounter.length; i++)
			if (valuesCounter[i] > threshold) {
				for (int j = 0; j < ary.length; j++)
					if (ary[j] == i) {
						ary[j] = -999;
						numberOfElementsDeleted++;
					}
			}
		int[] answerArray = new int[ary.length - numberOfElementsDeleted];
		int counter = 0;
		for (int i = 0; i < ary.length; i++)
			if (ary[i] != -999)
				answerArray[counter++] = ary[i];
		return answerArray;
*/
		
		
		// ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(ary));
		// HashMap<Integer, Integer> hm = new HashMap<>();
		// for (int i : al)
		// if (!hm.containsKey(i))
		// hm.put(i, 0);
		// else {
		// int temp = hm.get(i);
		// hm.remove(i);
		// hm.put(i, temp++);
		// }
		// al.clear();
		// for (int i = 0; i < hm.size(); i++) {
		// if (hm.get(i) <= threshold)
		// al.add(i);
		// }
		// return al;
	}

	public static void main(String[] args) {
		int[] al = answer(new int[] {1, 1, 1, 1, 1, 3,3,2,4,2,23,4,5,4,5,3,4,5,6,5,4,4,5,6,6,5,4,44,2,4534,24,524,6,245,245,452,424,542,542,5,545,425,425,245,5,425,254,524,542,5,542,524,54,52,5245,425,425,425,425,425,425,425,425,425,425,24,542,542,542,52,55,45,42,52,5425,425,4,5,5425,25,5,25,2452,52,54,54,525,5,425,24,54,252,52,545,25,425,5,424,5,5,2,5,25,25,525,245,2542, 1, 1, 1, 2, 2, 2, 2}, 4);
		for (int i : al)
			System.out.println("" + i);
	}
}