class Ps4{

	public static void main(String[] args){
		int a = 0;
		int temp = 0;
				
		for(int i =  1 ; i <= 4 ; i++){
				for(int j = 1 ; j <= i ; j++){
					temp = temp + a;
					System.out.print(" "+temp);
					a++;
					
				}
		System.out.println(" ");
		}
	}
}