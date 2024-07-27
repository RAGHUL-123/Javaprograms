class MyRunnable implements Runnable {
private String threadName;
MyRunnable(String name)
{threadName = name;}
public void run()
{
for(int i = 1;i<=5;i++)
{
System.out.println(threadName+"-count:"+i);
try
{Thread.sleep(500);}
catch (InterruptedException e) 
{
System.out.println(threadName + " Interrupted");
}}
System.out.println(threadName+"exiting");
}

public static void main (String args[])
{
MyRunnable myRunnable1 = new MyRunnable("Thread-1");
MyRunnable myRunnable2 = new MyRunnable("Thread-2");

Thread thread1 = new Thread(myRunnable1);
Thread thread2 = new Thread(myRunnable2);
thread1.start();
thread2.start();
}}