class Human{
    String name;
    int age=21;
    void talk(){
        System.out.println(name+" is talking");

    }
    void walk(){
        System.out.println(name+" is walking");

    }
    
}
class Omkar{
    public static void main(String args[]){
        Human obj=new Human();
        obj.name="swami gadu";
        obj.age=22;
        obj.talk();
        obj.walk();
        System.out.println(obj.age);

    }
}