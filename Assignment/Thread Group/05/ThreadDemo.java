/* Problem Statement: Real-Time Example - Batch Processing System
5. Simulate a batch processing system where each batch (thread group) processes a list of 
items. Create two thread groups, "Batch1" and "Batch2". Each thread in the group should 
process one item from the list. The threads should print the batch they belong to, their 
thread name, and the item they are processing */

class ThreadDemo extends Thread{
	String item ;
	ThreadDemo(ThreadGroup tg , String name, String item){
		super(tg,name);
		this.item = item;
	}
	@Override
	public void run(){
		System.out.println("Thread group :-"+getThreadGroup().getName()+ "  Name:-"+ Thread.currentThread().getName()+"  Processing item:- "+item);
	}
}
class Client{
	public static void main(String[]args){
		ThreadGroup tg1 = new ThreadGroup("Batch1");
		ThreadGroup tg2 = new ThreadGroup("Batch2");
		
		String list1[] = {"item1","item2","item3","item4"};
		for(int i = 0 ; i< list1.length ; i++){
			ThreadDemo td1 = new ThreadDemo(tg1,"B1_"+ i ,list1[i]);
			td1.start();
		}
		
		String list2[] = {"item5","item6","item7","item8"};
		for(int i = 0 ; i< list2.length ; i++){
			ThreadDemo td2 = new ThreadDemo(tg2,"B2_"+ i ,list2[i]);
			td2.start();
		}		
	}
}