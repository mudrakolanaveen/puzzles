package puzzle;

public class BalancedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] expressions = {
			"<>>>",
			"<>>>>",
		};
		int[] maxReplacements = {2,2};
		int[] result = balancedOrNot(expressions,maxReplacements);		
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		
		
		
	}
	
	static int[] balancedOrNot(String[] expressions, int[] maxReplacements){
		int[] result = new int[maxReplacements.length];		
		boolean balanced = false;
		
		for(int i=0;i<expressions.length;i++){
			balanced = false;
			for(int j=0;j<maxReplacements[i]+1;j++){
				int leftCnt = 0;
				for(int k=0; k<expressions[i].length();k++){
					if("<".equalsIgnoreCase(expressions[i].substring(k, k+1))){
						leftCnt++;
					}else if(">".equalsIgnoreCase(expressions[i].substring(k, k+1))){
						leftCnt--;
					}				
					if(leftCnt<0){
						expressions[i] = expressions[i].substring(0,k) + "<>" + expressions[i].substring(k+1,expressions[i].length());
						k=expressions[i].length();
					}
				}
				if(leftCnt == 0){
					balanced = true;
				}
			}
			if(balanced){
				result[i] = 1;				
			}else{
				result[i] = 0;
			}
		}
		return result;
	}

}

