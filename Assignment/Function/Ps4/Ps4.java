import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps4{
		static int a ;
	static void check(int a){
		if(a > 0){
			System.out.println("NATURAL NUMBER");
		}else if(a >= 0){
			System.out.println("WHOLE NUMBER");
		}else{
			System.out.println("INTEGER");
		}
	}
	
}

class Client{

	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		System.out.print("ENTER NUMBER :- ");
		int a = Integer.parseInt(br.readLine());

		Ps4.check(a);
	}
}