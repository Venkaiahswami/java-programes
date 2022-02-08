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
    public static void main(String args[]){
        Static obj=new Static();
        Static obj1=new Static();
        obj.name="swami";
        obj.listen();
        obj1.name="kishore";
        obj1.listen();

        Static.board="white";
        Static.teaching();
    }
}