package xianchengtest;

public class duochuangkoumaipiaoRunnable {
    public static void main(String[] args) {


        thread11 t1=new thread11();
        Thread e=new Thread(t1);
        Thread e1=new Thread(t1);
        Thread e2=new Thread(t1);
        e.setName("窗口一");
        e1.setName("窗口二");
        e2.setName("窗口三");
        e.start();
        e1.start();
        e2.start();




    }

}
class thread11 implements Runnable
{
    private int x=10000;
    Object obj=new Object();
    @Override
    public void run() {

        while(true)
        {
            synchronized(obj)
            {
            if(x>0)
            {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"卖票"+"票号是"+x);
                x--;
            }
            else
            {
                break;
            }
        }}

    }
}
