class Ps7{

	public static void main(String[] args){
		int n = 5623 ;
		int temp = 0 ;

			temp = n ;
		while( n != 0){
			temp = n % 10 ;
			n = n / 10 ;
		}
	}
}