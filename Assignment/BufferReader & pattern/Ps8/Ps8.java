class Ps8{
	public static void main(String[] args){
	
		for(int i = 1 ; i <= 8 ; i++){
			for(int j = 1 ; j <= i ; j++){
				if(i == 1 || i == 5){
					System.out.print(" %");
				}else if( i == 2 || i == 6){
					System.out.print(" ^");				
				}else if( i == 3 || i == 7){
					System.out.print(" (");
				}else if(i == 4 || i == 8){
					System.out.print(" )");
				}

			}
		System.out.println(" ");
		}
	}
}