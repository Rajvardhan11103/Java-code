import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps9{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("ENTER SIZE OF ARRAY :- ");
	int n = Integer.parseInt(br.readLine());
	int temp = 0 ;
	int evencount = 0 ;
	int oddcount = 0 ;
	int arr[] = new int[n] ;
		for(int i = 0 ; i <= n-1 ; i++){
			System.out.print("ENTER ELEMENTS OF ARRAY :- ");
			arr[i] = Integer.parseInt(br.readLine());
			temp = temp + arr[i] ;
			if( arr[i] % 2 == 0){
				evencount ++ ;
			}else{
				oddcount ++ ;
			}
		}
	System.out.println("  ");
	System.out.println("SUM OF ALL ELEMENTS OF ARRy is " + temp);
	System.out.println("EVEN COUNT IS " + evencount );
	System.out.println("ODD COUNT IS " + oddcount);
	}
}