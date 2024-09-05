import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps2{
	static int i ;
	
	static void check(int i){
		if( i < 20){
			System.out.println("GIVE NO. IS LESS THAN 20");
		}else{
			System.out.println("GIVEN NO. GREATER THAN 20");
		}
	}

}

class Client{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		System.out.print("ENTER ANY NO. :- ");
		int i = Integer.parseInt(br.readLine());
			Ps2.check(i);
	}
}