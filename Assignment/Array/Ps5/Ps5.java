import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps5{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("ENTER SIZE OF ARRAY :- ");
	int n = Integer.parseInt(br.readLine());	
	int arr[] = new int[n];
	int temp = 0 ;
		
		for(int i = 0 ; i <= n-1 ; i++){
			System.out.print("ENTER ELEMENTS OF ARRAY :- ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0 ; i <= n-1 ; i++){
			if(i % 2 != 0){
				temp = temp + arr[i] ;
			}
		}
	System.out.println(" ");
	System.out.print("SUN OF ELEMENTS AT ODD INDEX IS :- "+ temp);
	}
}