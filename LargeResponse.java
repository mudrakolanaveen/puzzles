package puzzle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class LargeResponse {

	public static void main(String[] args) {
		
		String filename = "filename.txt";
		int cnt = 0;
		long total = 0;
		long bytes = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	bytes = Long.valueOf(line.split(" ")[line.split(" ").length-1]);
		    	if(bytes>5000){
		    		total = total + bytes;
		    		cnt++;
		    	}
		    }
		    
		    FileWriter fw = new FileWriter("bytes_"+filename);
		    fw.write(cnt+"\n");
		    fw.write(total+"");			
			fw.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
