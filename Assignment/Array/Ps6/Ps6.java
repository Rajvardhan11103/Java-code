import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

 class Ps6{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("ENTER SIZE OF ARRAY :- ");
	int n = Integer.parseInt(br.readLine());
	String arr[] = new String[n];
		for(int i = 0 ; i <= n-1 ; i++){
			System.out.print("ENTER ELEMENTS OF ARRAY :- ");
			arr[i] = br.readLine();
		}
	}
}