/*Problem Statement: Real-Time Example - Web Server Simulation
4. Simulate a simple web server where different types of requests (threads) belong to 
different categories (thread groups). Create two thread groups, "GETRequests" and 
"POSTRequests". Add three threads to each group. Each thread should print its request 
type, thread name, and simulate handling the request by sleeping for 2 seconds.*/

class ThreadDemo extends Thread{
	
	ThreadDemo(ThreadGroup tg , String name){
	super(tg,name);
	}
	@Override
	public void run(){
			System.out.println("  +  Request type:- " + getThreadGroup().getName() + "    Name of Thread :- "+Thread.currentThread().getName());
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println("THREAD INTERRUPTED...");
			}
	}
}
class Client{
		public static void main(String[] args){
			ThreadGroup tg1 = new ThreadGroup("GETRequests");
			ThreadGroup tg2 = new ThreadGroup("POSTRequests");
				
			ThreadDemo td1 = new ThreadDemo(tg1,"REQUEST1");
			ThreadDemo td2 = new ThreadDemo(tg1,"REQUEST2");
			ThreadDemo td3 = new ThreadDemo(tg1,"REQUEST3");
			td1.start();
			td2.start();
			td3.start();
			
			ThreadDemo td4 = new ThreadDemo(tg2,"REQUEST4");
			ThreadDemo td5 = new ThreadDemo(tg2,"REQUEST5");
			ThreadDemo td6 = new ThreadDemo(tg2,"REQUEST6");
			td4.start();
			td5.start();
			td6.start();
		}
}