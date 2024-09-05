import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps1{
		
		static int a = 0 ;

	 static void even(int a){
		if( a % 2 == 0){
			System.out.print("GIVEN NO IS EVEN");
		}else{
			System.out.print("GIVE NO IS ODD");			
		}
	}
	
}

class Client{
	public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	System.out.print("ENTER ANY NO. :- ");
	int a = Integer.parseInt(br.readLine());
		Ps1.even(a);
	
	}
}