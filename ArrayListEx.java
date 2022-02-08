import java.util.ArrayList;
import java.util.*;
class ArrayListEx{
    public static void main(String arg[]){
        ArrayList list=new ArrayList();
        System.out.println(list.isEmpty());
        list.add("swami");
        list.add("kishore");
        list.add(1,"sainadh"); 
        list.add("hemanth");
        list.add("hemanth");
        System.out.println(list);
        System.out.println(list.contains("kishore"));
       // System.out.println(list.getFirst()); these methods are nor not present in arraylist
       // System.out.println(list.getLast());
        System.out.println(list.get(3));
        ListIterator<String> li=list.listIterator();
        while(li.hasNext()){
            String s=li.next();
            System.out.println("hello"+s); 
        }

    }
}