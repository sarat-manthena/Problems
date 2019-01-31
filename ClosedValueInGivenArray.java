package com.learning.problems;

public class ClosedValueInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {2,5,5,7,8,12,15};
		int targetElement = 9;
		System.out.println("Nearest element index:"+findNearestElement(inputArray,targetElement));

	}
	static int findNearestElement(int[] a,int target) {
		int element=0;
		element = findElement(a,target,0,a.length);
		
		return element-1;
		
	}
	static int findElement(int[]a, int target, int start, int end) {
		if((end-start)==1 || (end-start) ==0)
			return end;
		int mid = (start+end)/2;
		if(a[mid] > target) {
			return findElement(a,target,start,mid);
		}else {
			return findElement(a,target,mid+1,end);
		}
	}

}
