package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

public class GeneralQuestions {
	
	public GeneralQuestions(){};
	
	
/*	Find the most frequent integer in an array */

	public int frequentInt(int [] arr)
	{	
		int freqInt;
		int maxIndex = -1;
		int numIntsInArray = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			freqInt = 0;
			for(int j = i; j < arr.length; j++)
			{
				if(arr[j] == arr[i])
				{
					freqInt++;
				}
			}
			
			if(freqInt > numIntsInArray)
			{
				numIntsInArray = freqInt;
				maxIndex = i;
			}
		}
		return arr[maxIndex];
	}

	public int pairsSorted(int [] arr)
	{
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < arr.length;i++)
		{
			numList.add(arr[i]);
		}
		Collections.sort(numList);
		int pair = 0;
		
		//Minor enhancement can be made by only testing 1/2 the numbers.
		for(int i : numList)
		{
			if(numList.contains(10-i))
			{
				pair++;
			}
		}
		return pair/2;
	}

	/*
	 * Hashing makes this operation O(n). Mind. Blown.
	 * */
	public int pairSortedHash(int [] arr)
	{
		int pair = 0;
		
		Hashtable<Integer, Integer> hashArray = new Hashtable<Integer,Integer>();
		
		for(int i = 0; i < arr.length; i++)
		{
			hashArray.put(arr[i], i);
		}		
		
		for(int i = 0; i < arr.length;i++)
		{
			if(hashArray.containsKey(10 - arr[i]))
			{
				pair++;
			}
		}
		return pair/2;
	}
	
	
			
			
	
}
