/* Problem Statement: Using join() for Cooperative Multithreading
9. Create two threads: one that prints "Ping" and another that prints "Pong". Use the join()
method to allow the threads to alternate their execution, simulating a ping-pong game. */

class Pingthread extends Thread{
	@Override
	public void run(){
		for(int i = 1 ; i <7 ; i++){
			System.out.println("ping");
			Thread.yield();
		}
	}
}
class PongThread extends Thread{
	@Override
	public void run(){
		for(int i = 1 ; i <7 ; i++){
			System.out.println("pong");
			Thread.yield();
		}
	}
}
class Client{
		public static void main(String[] args){
			Pingthread pt = new Pingthread();
			PongThread po = new PongThread();
			try{
				pt.start();
				pt.join();
				po.start();
				po.join();
			}catch(InterruptedException ie){
				
			}

		}
}