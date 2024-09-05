/*  InterruptedException
6. Problem Statement:
o Write a program that spawns a new thread to sleep for a specified time. Handle 
the InterruptedException that occurs if the thread is interrupted while sleeping */

class SleepThreadExample {
    public static void main(String[] args) {
        Thread sleepingThread = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep for 5 seconds.");
                Thread.sleep(5000); 
                System.out.println("Thread woke up after sleeping.");
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted while sleeping.");
            }
        });

        sleepingThread.start();

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sleepingThread.interrupt();
    }
}

