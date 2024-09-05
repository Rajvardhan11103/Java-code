class Ps3{

	public static void main(String[]args){

		for(int i = 1 ; i <= 5 ; i++){
		int a = 5 ;
		int b = 8 ;
		int c = 9 ;
		int d = 8 ;
		
			for(int j = 5 ; j >= i ; j--){
			
				if(i  == 1  ){
					System.out.print(" "+a--);
				}else if( i == 2 ){
					System.out.print(" "+b);
					b = b - 2 ; 
				}else if( i == 3){
					System.out.print(" "+c);	
					c = c -3 ;
				}else if( i == 4){
					System.out.print(" "+d);
					d = d -4 ;
				}else{
					System.out.print(" "+a);
				}
			}
		System.out.println(" ");
		}
	}

}