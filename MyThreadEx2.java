class  MyThread extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }

    }
}




class ThreadEx2{
    public static void main(String atg[]){
        Thread t=Thread.currentThread();
        System.out.println(t);
        //output for single default thread( parent thread) is Thread[main,5,main] 5 is priority first main is thread name, second main is group  name
        MyThread obj=new MyThread();// step 3
        Thread obj1=new Thread(obj);// step 4  creating object for thread class
        obj1.setName("first");// we write name for threads
        System.out.println(obj1);
        obj1.start();// if you want to run thread program the we need start method

        // second  child Thread
        MyThread obj2=new MyThread();
        Thread obj3=new Thread(obj2);
        obj3.setName("second");
        System.out.println(obj3);
        obj3.start();


    }
    
}