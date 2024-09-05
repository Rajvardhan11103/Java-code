import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps2{
	public static void main(string[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("ENTER SIZE OF ARRAY");
	int n = Integer.parseInt(br.readLine());
	int arr[] = new int [n];
	int temp = 0 ;
	int p = 0 ;	
		for(int i =0 ; i <= n-1 ; i++){
			System.out.print("ENTER ELEMENTS OF ARRAY :- ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0 ; i <= n-1 ; i++){
			
			if(arr[i] % 2 == 0){

				temp = arr[i];
				p = temp*arr[i];
			}
		}
		System.out.println("PRODUCT OF EVEN ELEMENTS OF ARRAY IS:- "+p);
	}
}

}