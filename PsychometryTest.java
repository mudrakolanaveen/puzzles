package puzzle;

public class PsychometryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {1,3,5,6,8};
		int[] lowerLimits = {2};
		int[] upperLimits = {6};
		
		int[] results = jobOffers(scores,lowerLimits,upperLimits);
		
		for(int i=0; i< results.length;i++){
			System.out.println(results[i]);
		}
	}
	
	static int[ ] jobOffers(int[ ] scores, int[ ] lowerLimits, int[ ] upperLimits){
		int[] results = new int[lowerLimits.length];
		int cnt = 0;
		for(int i=0; i< lowerLimits.length;i++){
			cnt = 0;
			for(int j=0; j<scores.length;j++){
				if(scores[j]>=lowerLimits[i] && scores[j]<=upperLimits[i])
					cnt++;
			}
			results[i]=cnt;
		}
		
		return results;		
	}

}

