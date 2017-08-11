
public class ThreadDemo extends Thread {
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(i);
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        ThreadDemo td=new ThreadDemo();
        ThreadDemo td1=new ThreadDemo();
        System.out.println("Before THREAD");
//        td.start();

        System.out.println("After Thread " +Thread.currentThread().getName());
        System.out.println("After Thread " +Thread.currentThread().getPriority());
        System.out.println("After Thread " +Thread.currentThread().isAlive());
//        System.out.println("After Thread " +Thread.currentThread().join(););


        td.start();
        try {
            td.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        td1.start();

    }

}

