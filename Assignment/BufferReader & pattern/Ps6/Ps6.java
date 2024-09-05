import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps6{

	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("ENTEC 1 st &2 nd CHARACTER :- ");
		char c1 = (char)br.read();
		char c2 =(char)br.read() ;
		
			if(c1 == c2){
				System.out.println("BOTH CHARACTR ARE EQUAL...");
			}else{
				System.out.println("BOTH CHARACTR ARE DIFFERENT...");
			}
		
	}
}