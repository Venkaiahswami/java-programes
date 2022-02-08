class Static{
    String name;
    void listen(){
        System.out.println(name+" is listening the class");
    }
    static String board;
    static void teaching(){
        System.out.println(board+" is good colour");
    }
}
class StaticBlock{
    static{ //it will execute before execution of main block 
        System.out.println("hi friends");
    }
    public static void main(String args[]){
        Static obj=new Static();
        obj.name="swami";
        obj.listen();
        Static.board="white";
        Static.teaching();
    }
}