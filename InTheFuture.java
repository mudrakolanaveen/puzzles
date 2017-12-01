package puzzle;

public class InTheFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 4;
		int K = 5;
		int P = 1;
		
		int minNoOfDays = minNum(A,K,P);
		System.out.println(minNoOfDays);
	}

	static int minNum(int A, int K, int P){
		return (P+1)/(K-A);
	}
	
}
