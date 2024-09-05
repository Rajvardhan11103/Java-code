/*Problem Statement: Basic ThreadGroup Example Using implements Runnable
2. Create a ThreadGroup and add three threads that implement Runnable to the group. Each 
thread should print its name and the group it belongs to. Start all threads.*/

class ThreadDemo implements Runnable{

	@Override
	public void run(){
		System.out.println("Thread Name : " + Thread.currentThread().getName() + "     Thread Group: " + Thread.currentThread().getThreadGroup().getName());
	}
}
class Client{
	public static void main(String[] args){
		
			ThreadGroup tg = new ThreadGroup("Engineering");
			
		//  thread th = new Thread( grp , runnable cha instace , name of thread );
			ThreadDemo obj = new ThreadDemo();
			Thread th = new Thread(tg,obj,"mechanical");
			th.start();
			
			ThreadDemo obj1 = new ThreadDemo();
			Thread th1 = new Thread(tg,obj1,"electrical");
			th1.start();
			
			ThreadDemo obj2 = new ThreadDemo();
			Thread td2 = new Thread(tg,obj2,"chemical");
			td2.start();
			}
}