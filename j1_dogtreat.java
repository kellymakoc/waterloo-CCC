package uw2020;
import java.io.*;
public class j1_dogtreat {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int L = Integer.parseInt(br.readLine());
		int sum = 1*S+2*M+3*L;
		if (sum >= 10) {
			System.out.println("happy");
		}
		else {
			System.out.println("sad");
		}
		
	}

}
