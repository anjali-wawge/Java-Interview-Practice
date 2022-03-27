package com.arrayPrograms;

public class AverageOfArray {
	
	public static void main(String[] args) {
		int avgArray[]=new int[]{1,2,3,4,5,6,7,8,9};
		
		int sum=0;
		for(int i=0;i<avgArray.length;i++) {
			sum=sum+avgArray[i];
		}
		int avg=sum/avgArray.length;
		System.out.println("Average of array:"+avg);
	}

}
