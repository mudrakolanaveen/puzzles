package puzzle;

public class Tickets {
	
	public static void main(String arg[]){
		
		int[] tickets = {4};
		int p = 0;		
		long waiting_time = waitingTime(tickets,p);
		
		System.out.println(waiting_time);
		
	}
	
	static long waitingTime(int[] tickets, int p){
		
		int n=tickets.length;
		long waiting_time = 0;
		int level = tickets[p];
		
		for(int i =0;i<level;i++){
			for(int j=0;j<n;j++){
				if(tickets[p]>0 && tickets[j]>0){
					tickets[j]--;
					waiting_time++;					
				}
			}
		}
		
		return waiting_time;
	}
	

}
