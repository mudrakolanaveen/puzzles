package puzzle;

import java.util.ArrayList;
import java.util.List;

public class LargeSubSetSum {

	public static void main(String[] args) {

		int[] k = {2,4};
		long[] result = maxSubsetSum(k);
		
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		
	}
	
	static long[ ] maxSubsetSum(int[ ] k){
		long[] result = new long[k.length];		
		int sum = 0;		
		for(int i=0;i<k.length;i++){			
			sum = 0;
			for(int j=1;j<=(k[i]/2);j++){
				if(k[i]%j==0){
					sum = sum+j;
				}				
			}
			result[i] = sum+k[i];
		}
		return result;
	}
	
}
