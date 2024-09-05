/* Problem Statement: Using yield() to Yield Execution
7. Create a thread that prints "Hello" 5 times and another thread that prints "World" 5 times. 
Use the yield() method to allow other threads to execute between each print statement. */

class HellowThread extends Thread{
	@Override
	public void run(){
			for(int i = 1 ; i < 6 ; i++){
					System.out.println("Hellow");
					Thread.yield();
			}
	}
}
class WorldThread extends Thread{
	@Override
	public void run(){
			for(int i = 1 ; i < 6 ; i++){
					System.out.println("World");
					Thread.yield();
			}
	}

}
class Client{
		public static void main(String[] args){
			HellowThread ht = new HellowThread();
			WorldThread wt = new WorldThread();
			ht.start();		
			wt.start();
		}
}
