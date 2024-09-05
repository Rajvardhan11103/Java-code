/* Problem Statement: Using sleep() to Pause Execution
5. Create a thread that prints numbers from 1 to 5, pausing for 1 second between each 
number using Thread.sleep() */

class ThreadDemo extends Thread{

	@Override
	public void run(){
		for(int i = 1 ; i <6 ; i++){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				System.out.println("THREAD INTERRUPTED...");
			}
		}
	}
}
class Client{
	public static void main(String[] args){
		ThreadDemo td = new ThreadDemo();
		td.start();
	}
}