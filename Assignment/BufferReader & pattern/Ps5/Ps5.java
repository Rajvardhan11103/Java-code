import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps5{

	public static void main(String[] args) throws IOException{
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);	

	System.out.print(" ENTER NO. :- ");
	int i = Integer.parseInt(br.readLine());

	System.out.println(" ODD NOS. :- ");
		for(int k = i ;  k <= 50 ; k++ ){

			if( k % 2 != 0){
				System.out.println(k);
			}

		}
        
	System.out.print(" ENTER NO. :- ");
	int j = Integer.parseInt(br.readLine());
        System.out.println(" EVEN NOS. :- ");
		for(int k = j ;  k >= 2 ; k-- ){

			if( k % 2 == 0){
				System.out.println(k);
			}
		}

	}

}