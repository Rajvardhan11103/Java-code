/*1. Problem Statement: Basic ThreadGroup Example Using extends Thread
o Create a ThreadGroup and add three threads that extend Thread to the group. Each 
thread should print its name and the group it belongs to. Start all threads*/

class ThreadDemo extends Thread{

	ThreadDemo(ThreadGroup tg , String name){
		super(tg , name);
	}
	@Override
	public void run(){
		System.out.println("Thread Name: " + getName() + ",    Thread Group: " + getThreadGroup().getName());
	}
}
class Client{
	public static void main(String[] args){
		ThreadGroup tg = new ThreadGroup("Indian Armed Forces");
		
		ThreadDemo td = new ThreadDemo(tg,"Army");
		td.start();
		
		ThreadDemo td1 = new ThreadDemo(tg,"Navy");
		td1.start();
		
		ThreadDemo td2 = new ThreadDemo(tg,"Air Force");
		td2.start();
	}
}