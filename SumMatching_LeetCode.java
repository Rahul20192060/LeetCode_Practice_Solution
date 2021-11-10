package JavaDSAAlgo;

import java.util.*;
public class SumMatching_LeetCode {
	
		

	public int[] twoSum(int[]nums,int target)  {
		// TODO Auto-generated method stub
		Map<Integer, Integer> numbersMap= new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			numbersMap.put(nums[i], i);
		}
		
		for(int i=0;i<nums.length;i++) {
			int number=nums[i];
			int rem=target-number;
			
			if(numbersMap.containsKey(rem)) {
				int index= numbersMap.get(rem);
				if(index==i)continue;
				return new int [] {i,index};
			}
		}return new int [] {};
	
	}
    }

