/* Problem Statement: Print Numbers Using implements Runnable
2. Create a class that implements Runnable and overrides the run() method to print numbers 
from 1 to 10. Create an instance of this class, pass it to a Thread object, and start the 
thread. */

class ThreadDemo implements Runnable{
	
	@Override
	public void run(){
		for(int i = 1 ; i < 11 ; i++){
			System.out.println(i);
		}
	}
}
class Client{
	public static void main(String[] args){
		ThreadDemo obj = new ThreadDemo();
		Thread td = new Thread(obj);
		td.start();
	}
}