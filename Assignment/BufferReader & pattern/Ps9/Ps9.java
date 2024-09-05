import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps9{

	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("ENTER ANY NO. :- ");
		int a = Integer.parseInt(br.readLine());
		
			for(int i = a ; i >= 0 ; i--){
				System.out.println(i);
			}

	}
}