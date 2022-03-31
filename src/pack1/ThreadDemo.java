package pack1;

public class ThreadDemo extends Thread { // Thread is a built in class note T must be capital

    @Override
    public void run() {
        System.out.println("Current thread is "+Thread.currentThread().getName());
    }

    public static void main(String[] args) { //built in thread priority =5 in every program in java
        ThreadDemo objthrd =new ThreadDemo();
        ThreadDemo objthrd1 = new ThreadDemo();
        ThreadDemo objthrd2 = new ThreadDemo();

    }

}
