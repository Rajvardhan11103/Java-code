/*Problem Statement: Using join() to Ensure Thread Completion
6. Create two threads: one that prints even numbers from 2 to 10 and another that prints odd 
numbers from 1 to 9. Use the join() method to ensure the main thread waits for both 
threads to complete before printing "Done"*/

class EvenThreadDemo extends Thread{

	@Override
	public void run(){
		for(int i = 2 ; i< 11 ; i= i+2){
			System.out.println(i);
		}
	}
}
class OddThreadDemo extends Thread{

	@Override
	public void run(){
		for(int i = 1 ; i< 10 ; i= i+2){
			System.out.println(i);
		}
	}
}
class client{
	public static void main(String[] args){
		EvenThreadDemo td1 = new EvenThreadDemo();
		td1.start();
		
		OddThreadDemo td2 = new OddThreadDemo();
		td2.start();
		
		try{
			td1.join();
			td2.join();
		}catch(InterruptedException e){
			System.out.println(" ");
		}finally{
			System.out.println("DONE..");	
		}
		
		
	}
}