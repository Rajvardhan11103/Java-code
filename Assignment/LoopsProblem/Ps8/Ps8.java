class Ps8{
	public static void main (String[] args){

		int e = 0 ;
		int o = 1;
		for(int i = 1 ; i <= 10 ; i++){
		
			if(i % 2 == 0){
				e = e + i ;
			}else{
				o = o * i;
			}
 		
		}
	System.out.println(" SUM OF ALL EVEN NO :- " + e );
	System.out.println(" PRODUCT OF ALL ODD NO :- "+ o);
	}
}