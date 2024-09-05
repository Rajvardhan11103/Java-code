import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps8{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("ENTER SIZE OF ELEMENTS :- ");
	int n = Integer.parseInt(br.readLine());
	int arr[] = new int[n];
	int temp = 0  ;
		for(int i = 0 ; i <= n-1 ; i++){
			System.out.print("ENTER ELEMENTSOF ARRAY:- ");
			arr[i] = Integer.parseInt(br.readLine());
			temp = temp + arr[i] ;
		}
	System.out.println(" ");
	System.out.println("SUM OF ALL ELEMENTS OF ARRAY IS :- " + temp);
	}
}