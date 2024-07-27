// class Thread1 extends Thread {
//     public void run() {
//         for (int i = 0; i <= 10; i++) {
//             System.out.println(i);
//             try {
//                 Thread.sleep(500);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class Thread2 extends Thread {
//     public void run() {
//         for (int j = 10; j <= 20; j++) {
//             System.out.println(j);
//             try {
//                 Thread.sleep(50);
//             } catch (InterruptedException r) {
//                 r.printStackTrace();
//             }
//         }
//     }
// }

// public class Theards{
//     public static void main(String[] args) {
//         Thread1 t1 = new Thread1();
//         Thread2 t2 = new Thread2();
//         t1.start();
//         t2.start();
//     }
// }

// class Thread1 extends Thread{
//     int i;
//     public void run(){
//      for(i=0;i<=10;i++){
//         System.out.println(i);
//         try{Thread.sleep(500);}
//         catch(Exception e)
//         {e.printStackTrace();{}}}}}

//         class Thread2 extends Thread{
//             int j;
//             public void run(){
//                 for(j=0;j<=20;j++){
//                    System.out.println(j);
//                    try{Thread.sleep(50);}
//                    catch(Exception e)
//                    {r.printStackTrace();{}}}}} 

// public class Theards
// { 
//     public static void main(String[] args)
// { 
//     Thread1 t1=new Thread1();
//     Thread2 t2=new Thread2();
//     t1.start();
//     t2.start();
// }
// }
class Thread1 extends Thread{
    int i;
    public void run(){
     for(i=0;i<=10;i++){
        System.out.println(i);
        try{Thread.sleep(500);}
        catch(InterruptedException e)
        {e.printStackTrace();{}}}}}

        class Thread2 extends Thread{
            int j;
            public void run(){
                for(j=0;j<=20;j++){
                   System.out.println(j);
                   try{Thread.sleep(50);}
                   catch(InterruptedException r)
                   {r.printStackTrace();{}}}}} 

public class Theards
{ 
    public static void main(String[] args)
{ 
    Thread1 t1=new Thread1();
    Thread2 t2=new Thread2();
    t1.start();
    t2.start();
}
}
        