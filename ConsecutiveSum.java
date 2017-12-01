package puzzle;

public class ConsecutiveSum {

	public static void main(String[] args){
		
		long num = 15; // input any number here
		int count = consecutive(num);
		System.out.println("Count:"+count);

	}
	static int consecutive(long num) {
		
		long last = num/2+1;
		long tempLast = 1;
		long tempFirst = 1;
		long sum = 0;
		int count = 0;
		int n=1;
		while(tempFirst < last){
			sum = (n*(tempFirst+ tempLast))/2;
			//System.out.println("sum"+sum);
			if(sum < num){
				tempLast ++;
				n++;
			}else{
				if(sum == num){
					count++;
					tempFirst ++;
					tempLast ++;					
				}else{
					tempFirst ++;
					n--;
				}
			}			
		}
		//System.out.println("sum"+ sum+ " count"+count+"  tempFirst"+tempFirst+" tempLast"+tempLast);
		return count;
	}	
}
