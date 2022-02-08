class JavaClass{
    String name;//instance variable
    void listen1(){//instance method
        System.out.println(name+"is listening");
    }
    void listen(){
        System.out.println(name+"is listening");
    }

    static String board;//static variable
    static void teaching(){//static variable
       // System.out.println(name);//non-static variable name cannot be referenced from a static context
        System.out.println("swami"+  board);   }
}



class StaticEx1{
    public static void main(String arg[]){
        JavaClass swami=new JavaClass();
        swami.name="swami gadu";
        swami.listen();
        JavaClass obj=new JavaClass();
        obj.name="rakesh gadu";
        obj.listen();

        JavaClass.board="white";
        JavaClass.teaching();




    }
}