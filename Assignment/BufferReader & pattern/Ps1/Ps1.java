class Ps1{	

	public static void main(String[] args){
		
		
		for(int i = 1 ; i <= 4 ; i++){
		char ch = 'z';
		char chh = 'Y';
		int a = 4 ;
		int b = 1 ;
			for(int j = 1 ; j <= 4 ; j++){
				if(i == 1 || i == 3){
					System.out.print(" "+ch+a--);
				}else{

					System.out.print(" "+chh+b++);
				}

			}
		 	System.out.println(" ");
		}
	}
}