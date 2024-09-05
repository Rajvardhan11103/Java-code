 /* Problem Statement: Using join() for Sequential Execution
8. Create three threads that print numbers from 1 to 5. Use the join() method to ensure that 
the threads execute sequentially (i.e., the second thread starts only after the first thread 
finishes, and the third thread starts only after the second thread finishes). */

class ThreadDemo extends Thread{
	@Override
	public void run(){
		for(int i = 1 ; i< 6 ; i ++){
			System.out.println(Thread.currentThread().getName()+ ":- "+i);
		}
	}
}
class Client{
		public static void main(String[] args){
			ThreadDemo td1 = new ThreadDemo();
			ThreadDemo td2 = new ThreadDemo();
			ThreadDemo td3 = new ThreadDemo();
			try{
				
				td1.start();
				td1.join();
				
				td2.start();
				td2.join();
				
				td3.start();
				td3.join();
			}catch(InterruptedException ie){
				System.out.println("InterruptedException occurs");
			}finally{
					System.out.println("DONE..");
			}
			
			
		}
}