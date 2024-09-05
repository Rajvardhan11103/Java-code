import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps3{
	
	static int a ;
	static void check(int a){
		if( a >= 0){
			System.out.println("NO IS POSITIVE");
		}else{
			System.out.println("NO IS NEGATIVE");
		}
	}

}

class Client{
	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("ENTER NO. :-  ");
		int a = Integer.parseInt(br.readLine());
			
			Ps3.check(a);
	}
}