package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {
	
	public static void main(String[] args){
		List<Integer> arr = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			arr.add(random.nextInt(1000));
		}
		
		arr = quickSort(arr);
		System.out.println(arr);
	}

	public static List<Integer> quickSort (List<Integer> arr) {
		if(arr.size()<=1){
			return arr;
		}
		
		int pivot = selectPivot(arr);
		
		List<Integer> less = new ArrayList<Integer>();
	    List<Integer> greater = new ArrayList<Integer>();
		
		
	    for (int i = 0; i < arr.size(); i++) {
	        if (arr.get(i) < pivot) {
	          less.add(arr.get(i));
	        } else if (arr.get(i) > pivot) {
	          greater.add(arr.get(i));
	        }
	      }
		
		 	less = quickSort(less);
		    greater = quickSort(greater);

		    return concatenate(less, pivot, greater);

	}

	private static List<Integer> concatenate(List<Integer> less, int pivot, List<Integer> greater) {
		List<Integer> result = new ArrayList<Integer>();
		
	    for (Integer num : less) {
	      result.add(num);
	    }
	    
	    result.add(pivot);
	    
	    for (Integer num : greater) {
	      result.add(num);
	    }

	    return result;
		
		
	}

	private static int selectPivot(List<Integer> arr) {
		int c = arr.size()-1;
		int b = c/2;
		int a=(arr.get(0)+arr.get(b)+arr.get(c))/2;
		return a;
	}
}