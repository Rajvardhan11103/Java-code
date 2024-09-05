class Ps4{

	public static void main(String[] args){
		
		int n = 5632 ; 
		int temp = 0 ; 
		int s = 0 ;
			temp = n ;
		while(n != 0){
			temp = n % 10 ;
			n = n / 10 ;
			if( temp % 2 != 0){
				s = s +temp ;
			}
		}
	 System.out.println("SUM OF ODD NO IS :- "+ s);
	}
}