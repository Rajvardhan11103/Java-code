import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ps5{
 	static int a ;
	static void print(int a){
		if(a == 1){
			System.out.println("ONE");
		}else if(a == 2){
			System.out.println("TWO");		
		}else if(a == 3){
			System.out.println("THREE");
		}else if(a == 4){
			System.out.println("FOUR");
		}else if(a == 5){
			System.out.println("FIVE");	
		}else{
			System.out.println("ENTER NO BEWEEN 1 TO 5 ");	
		}
	}
}
class Client{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);	

		System.out.print("ENTER NO :- ");
		int a = Integer.parseInt(br.readLine());

		Ps5.print(a);	
	}
}