package puzzle;

public class TwoCircles {


	
	public static void main(String[] a){
		
		/*String[] info = 
	               {"0 5 9 0 9 7",
	            	"0 15 11 0 20 16",
	            	"26 0 10 39 0 23",
	            	"37 0 5 30 0 11",
	                "41 0 0 28 0 13",
	                "41 0 0 41 0 13"};*/
		
		String[] info = {"12 0 21 14 0 23",
				"0 45 8 0 94 9",
				"35 0 13 10 0 38",
				"0 26 8 0 9 25"};
		
	    String result[] = circles(info);
	    
	    for(int i=0;i<result.length;i++){
	    	System.out.println(result[i]);
	    }
	    
	}
	
	static String[ ] circles(String[ ] info){

	    String result[] = new String[info.length];
	    double sumOfRadius=0;
	    double centerDist=0;
	    double radius1=0;
	    double radius2=0;
	    double radiusx=0;
	    double radiusy=0;
	    for(int i=0;i<info.length;i++){
	    	String[] infoDet = info[i].split(" ");
	    	radiusx =  Integer.valueOf(infoDet[0])==0?0:Integer.valueOf(infoDet[2]);
	    	radiusy =  Integer.valueOf(infoDet[1])==0?0:Integer.valueOf(infoDet[2]);		
	    	radius1 = Math.sqrt((Integer.valueOf(infoDet[0]) - radiusx) * (Integer.valueOf(infoDet[0]) - radiusx) +
					           ((Integer.valueOf(infoDet[1]) - radiusy) * (Integer.valueOf(infoDet[1]) - radiusy)));
	    	radiusx =  Integer.valueOf(infoDet[3])==0?0:Integer.valueOf(infoDet[5]);
	    	radiusy =  Integer.valueOf(infoDet[4])==0?0:Integer.valueOf(infoDet[5]);		
	    	radius2 = Math.sqrt((Integer.valueOf(infoDet[3]) - radiusx) * (Integer.valueOf(infoDet[3]) - radiusx) +
					           ((Integer.valueOf(infoDet[4]) - radiusy) * (Integer.valueOf(infoDet[4]) - radiusy)));
	    	sumOfRadius= Math.abs(Integer.valueOf(infoDet[2]) - Integer.valueOf(infoDet[5]));//Integer.valueOf(infoDet[5]) + Integer.valueOf(infoDet[2]);
	    	centerDist= Math.sqrt((Integer.valueOf(infoDet[0]) - Integer.valueOf(infoDet[3])) * (Integer.valueOf(infoDet[0]) - Integer.valueOf(infoDet[3])) +
	    					  ((Integer.valueOf(infoDet[1]) - Integer.valueOf(infoDet[4])) * (Integer.valueOf(infoDet[1]) - Integer.valueOf(infoDet[4]))));
	    	
	    	if(centerDist ==0){
	    		result[i]="Concentric";
	    	}else if(sumOfRadius==centerDist){
	    		result[i]="Touching";
	    	}else if(sumOfRadius > centerDist){
	    		result[i]="Disjoint-Inside";
	    	}else if(sumOfRadius < centerDist){
	    		result[i]="Intersecting";
	    		if(centerDist < radius2 || centerDist < radius2){
	    			result[i]="Disjoint-Outside";
	    		}
	    	}	    	
	    }
	    return result;
	}
	
}
