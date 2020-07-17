package uw2020;
import java.io.*;
public class j5_escaperoom {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int size = M*N;
		int array[][] = new int [M+1][N+1];
		for (int r=1;r <= M; r++) {
			for (int c = 1;c <= N; c++) {
				array [r][c] = Integer.parseInt(br.readLine());
			}
		}
		
		
		
		
		
		
		
	}

}
