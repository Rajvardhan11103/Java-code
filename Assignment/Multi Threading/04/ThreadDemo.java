/*Problem Statement: Sum of Array Elements Using implements Runnable
4. Create a class that implements Runnable to calculate the sum of elements in an array. 
Initialize the array in the constructor and override the run() method to compute the sum 
and print it. */

class ThreadDemo implements Runnable{
	int sum ;
	int arr[] ;
	ThreadDemo(int arr[]){
		this.arr = arr ;
	}
	@Override
	public void run(){
		sum =0 ;
		for(int i = 0 ; i < arr.length ; i++){
			sum = arr[i]+sum;
		}
		System.out.println("Sum of array elements:-  "+sum);
	}
}
class Client{
		public static void main(String[] args){
			int arr[] = {1,2,3,4,5};
			ThreadDemo obj = new ThreadDemo(arr);
			Thread td = new Thread(obj);
			td.start();
		}
}