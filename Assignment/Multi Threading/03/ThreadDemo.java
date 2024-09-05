/*Problem Statement: Sum of Array Elements Using extends Thread
3. Create a class that extends Thread to calculate the sum of elements in an array. Initialize 
the array in the constructor and override the run() method to compute the sum and print it */

class ThreadDemo extends Thread{
	int arr[];
	int sum ;
	ThreadDemo(int arr[]){
		this.arr = arr ;
	}
	@Override
	public void run(){
		sum = 0 ;
		for(int i = 0 ; i <arr.length ; i++){
			sum = arr[i] + sum ;
		}
		System.out.println("Sum of array elements:-  "+sum);
	}
}
class Client{
		public static void main(String[] args){
			int arr[] = {1,2,3,4,5};
			ThreadDemo td = new ThreadDemo(arr);
			td.start();
		}
}