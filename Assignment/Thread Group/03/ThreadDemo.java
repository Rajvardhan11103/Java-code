/*Problem Statement: Real-Time Example - Multi-Task Processing System
3. Simulate a multi-task processing system where different tasks (threads) belong to 
different departments (thread groups). Create two thread groups, "DepartmentA" and 
"DepartmentB". Add three threads to each group. Each thread should print its department, 
task name, and execute a simple task like counting to 5 with a 1-second delay between 
counts.*/

class ThreadDemo extends Thread{

	ThreadDemo(ThreadGroup dept , String name){
		super(dept , name);
	}
	@Override
	public void run(){
			System.out.println("Thread Name: " + getName() + ",    Thread Group: " + getThreadGroup().getName());
			        for (int i = 1; i <= 5; i++) {
						System.out.println(getName() + " - Count: " + i);
						try{
							Thread.sleep(1000);
						}catch(InterruptedException e){
							System.out.println("THREAD INTERRUPTED...");
						}
					}
	}
}
class Client{
	public static void main(String[] args){
	ThreadGroup dept1 = new ThreadGroup("DepartmentA");
	ThreadGroup dept2 = new ThreadGroup("DepartmentB");
		
	ThreadDemo th1 = new ThreadDemo(dept1,"A-Student1");
	ThreadDemo th2 = new ThreadDemo(dept1,"A-Student2");
	ThreadDemo th3 = new ThreadDemo(dept1,"A-Student3");
	ThreadDemo th4 = new ThreadDemo(dept2,"B-Student4");
	ThreadDemo th5 = new ThreadDemo(dept2,"B-Student5");
	ThreadDemo th6 = new ThreadDemo(dept2,"B-Student6");
	th1.start();
	th2.start();
	th3.start();
	th4.start();
	th5.start();
	th6.start();

	
	}
}

