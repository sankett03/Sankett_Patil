/*
 Program: Demonstration of Multithreading
 Author : MCA Student
 Description: This program shows two threads running simultaneously.
*/

class ThreadOne extends Thread {
    public void run() {
        // Loop to show thread activity
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadOne: Count " + i);
            try {
                Thread.sleep(500);  // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadTwo implements Runnable {
    public void run() {
        // Loop to show thread activity
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadTwo: Count " + i);
            try {
                Thread.sleep(700);  // Pause for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MCA_MultithreadingDemo {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");

        // Create thread objects
        ThreadOne t1 = new ThreadOne();              // Thread by extending Thread
        Thread t2 = new Thread(new ThreadTwo());     // Thread by implementing Runnable

        // Start both threads
        t1.start();
        t2.start();

        System.out.println("Main Thread Running Simultaneously with Other Threads");
    }
}
