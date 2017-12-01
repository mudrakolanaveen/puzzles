package puzzle;

public class FindWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] andrea={1,2,3};
		int[] maria={2,4,3};
		String s = "Odd";//Even
		
		String result = winner(andrea,maria,s);
		System.out.println(result);
	}
	
	static String winner(int[] andrea, int[] maria, String s) {
		String result = "Tie";
		int i = s.equalsIgnoreCase("Odd")?1:0;
		int andreaSum = 0;
		int mariaSum = 0;
		while(i<andrea.length){
			andreaSum = andreaSum + andrea[i];
			mariaSum = mariaSum + maria[i];
			i=i+2;
		}
		
		if(andreaSum > mariaSum) result="Andrea";
		else if (andreaSum < mariaSum) result="Maria";
		return result;
	}

}
