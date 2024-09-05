import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps3{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("ENTER SIZE OF ARRAY :- ");
	int n = Integer.parseInt(br.readLine());
	int arr[] = new int[n];
	int temp = 1 ;
		for(int i = 0 ; i <= n-1 ; i++){
			System.out.print("ENTER ELEMENTS OF ARRAY:- ");
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i = 0 ; i <= n-1 ; i++){
			if(arr[i] % 2 != 0){
				temp = temp*arr[i];
			}
		}
	System.out.println(" ");
	System.out.print("PRODUCT OF ODD ELEMENTS OF ARRAY IS "+temp);
	}
}