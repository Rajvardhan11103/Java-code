class Ps7{
	public static void main(String[] args){
		char ch = 'O' ;
		char ch1 = 'L' ;
		char ch2 = 'E' ;
		int b = 14 ;
		int c = 9 ;
		for(int i = 1 ; i <= 5 ; i++){
			for(int j = 1 ; j <= i ; j++){
				if(i == 1 ){
					System.out.print(" " + ch--);
				}else if( i == 2){
					System.out.print(" " + b--);
				}else if( i == 3){
					System.out.print(" " + ch1--);
				}else if(i == 4){
					System.out.print(" " + c--);
				}else{
					System.out.print(" " + ch2--);
				}
			
			}
		System.out.println(" ");
		}
	}
}