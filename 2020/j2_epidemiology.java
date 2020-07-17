package uw2020;
import java.io.*;
public class j2_epidemiology {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int R = Integer.parseInt(br.readLine());
		int num = R/N,day = 0, ppl = N+(N*R), inf = 0;
		
		while (ppl < P) {
			inf += ppl;
			ppl *= R;
			day++;
			System.out.println(ppl);
			
			if (ppl >= P) {
				System.out.println(day+1);
			}
		}		
	}		
}

