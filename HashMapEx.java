import java.util.*;
class HashMapEx{
    public static void main(String arg[]){
        HashMap<String,String> maps=new HashMap<String ,String>();
        System.out.println(maps.isEmpty());
        maps.put("fi","telugu");
        maps.put("si","english");
        maps.put("tl","hindi");
        if(maps.isEmpty())
            System.out.println("maps are empty");
        else
            System.out.println(maps.size());
        System.out.println(maps.get("si"));
        System.out.println(maps.keySet());
        System.out.println(maps.values());

        
        

    }
}