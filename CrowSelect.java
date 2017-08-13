package com.quickchat.controller;

import java.util.ArrayList;
import java.util.List;

public class CrowSelect {
	
	public static int findMinimumStones(int numberOfStones[], int potToFill)
	{
		int minimumStones=0;
		List<Integer> posibleCombinations=new ArrayList<>();
		
		for (int i = 0; i < numberOfStones.length; i++) {
			
			int temp=0;
			for (int j = 0; j < numberOfStones.length; j++) {
				
				if(numberOfStones[i]<=numberOfStones[j])
					temp=temp+numberOfStones[i];
			}
			posibleCombinations.add(temp);
		}
		minimumStones=posibleCombinations.get(0);
		for(int i:posibleCombinations)
		{
			if(minimumStones>i)
				minimumStones=i;
		}
		
		return minimumStones;
	}

}
