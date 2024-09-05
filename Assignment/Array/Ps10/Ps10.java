import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps10{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("ENTER SIZE OF ELEMENTS :- ");
	int n = Integer.parseInt(br.readLine());
	int arr[] = new int[n] ;
	int temp = 0 ;
	int evencount = 0 ;
	int oddcount = 0 ;
	int evensum = 0 ;
	int oddsum = 0 ;
		for(int i = 0; i <= n-1 ; i++){
			System.out.print("ENTER ELEMENTS OF ARRAY :- ");
			arr[i] = Integer.parseInt(br.readLine());
			
			temp = temp + arr[i] ;
			if(arr[i] % 2 == 0){
				evensum  = evensum + arr[i] ; 
				evencount++ ;
			}else{
				oddsum = oddsum +arr[i];
				oddcount++ ;
			}
		}
	System.out.println("  ");
	System.out.println("SUM OF ALL ELEMENTS OF ARRAY IS " + temp);
	System.out.println("EVEN ELEMENTS OF ARRAY IS " + evencount);
	System.out.println("ODD ELEMENTS OF ARRAY IS " + oddcount);
	System.out.println("SUM OF EVEN ELEMENTS OF ARRAY IS " + evensum);
	System.out.println("SUM OF ODD ELEMENTS OF ARRAY IS " + oddsum);
	}
}