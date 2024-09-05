import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps7{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int arr[] = new int[15];
		for(int i = 0 ; i <= 15-1 ; i++){
			System.out.print("ENTER ELEMENTS OF ARRAY :- ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0 ; i <= 15-1 ; i++){
			if(arr[i] % 10 == 0){
				System.out.println(" ");
				System.out.println("ELEMENTS DIVISIBLE BY 10  :- "+arr[i]);
			}			
		}
		
	}
}