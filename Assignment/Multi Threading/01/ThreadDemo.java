/* Problem Statement: Print Numbers Using extends Thread
1. Create a class that extends Thread and overrides the run() method to print numbers from 1 
to 10. Create an instance of this class and start the thread. */

class ThreadDemo extends Thread{

	@Override
	public void run(){
			for(int i = 1 ; i<11 ; i++){
					System.out.println(i);
			}
	}
}
class Client{
	public static void main(String[] args){
		ThreadDemo td = new ThreadDemo();
		td.start();
	}
}