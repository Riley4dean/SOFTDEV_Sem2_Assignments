<<<<<<< HEAD
public class SqrtRunnable implements Runnable{
=======
public class SqrtRunnable implements Runnable {
>>>>>>> 1de715d5244a9cf685c2d47bcb6bb19f56ed0fb4

    private Thread t;
    private double number;

    SqrtRunnable(double number) {
        this.number = number;
    }

    @Override
<<<<<<< HEAD
    public void run(){
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));
    }

    public void start(){
        if(t == null) {
=======
    public void run() {
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));
    }

    public void start() {
        if (t == null) {
>>>>>>> 1de715d5244a9cf685c2d47bcb6bb19f56ed0fb4
            t = new Thread(this);
            t.start();
        }
    }
<<<<<<< HEAD
    
=======

>>>>>>> 1de715d5244a9cf685c2d47bcb6bb19f56ed0fb4
}
