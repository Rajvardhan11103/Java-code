import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps11{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("ENTER SIZE OF ARRAY :- ");
	int n = Integer.parseInt(br.readLine());
	int arr[] = new int[n] ;
		for(int i = 0 ; i<= n-1 ; i++){
			System.out.print("ENTER ELEMNTS OF ARRAY :- ");
			arr[i] = Integer.parseInt(br.readLine());
		}
	System.out.print("ENTER NO TO BE SEARCH IN ARRAY :- ");
	int b = Integer.parseInt(br.readLine());
	System.out.println("--------------------");
		for(int i = 0 ; i<= n-1 ; i++){
			//System.out.println(arr[i]);
			if(arr[i] == b){
				System.out.print("GIVEN NO PRESENT AT INDEX " + i );
			}	
		}
	
	}

}