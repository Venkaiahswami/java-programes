import java.util.*;
class HashSetEx{                       
    public static void main(String arg[]){
        HashSet<String> names=new HashSet<String>();
        System.out.println("names"+names.isEmpty());// to check wheather data is present or not
        //adding elements or objects
        names.add("swami");
        names.add("swami gadu");
        if(names.isEmpty())
           System.out.println("hash set is still empty");
        else
           System.out.println(names.size());
        if(names.contains("swami gadu"))
           names.remove("swami gadu");
           System.out.println(names.size());
           names.clear();
           System.out.println(names.isEmpty());
           names.add("sainadh");
           names.add("kishore");
           names.add("anil");
           names.add("rakesh");
           //to print elements
           System.out.println(names);
           /*for(String a:names){//for each element in names is assign to a variable in for each loop
               String newvalue="welcome "+a;
               System.out.println(newvalue);
           }*/
          /* Iterator<String> newNames=names.iterator();//names are converted into iterator and they will assign to newNames
           while(newNames.hasNext())//to check element is present or not
          {
               String n=newNames.next();//retreave elements
                String newvalue="welcome to "+n;
                System.out.println(newvalue);
           }*/


            

    }
}