//program to demonstrate stack(lifo) in java
import java.util.*;
class StackEx{
    public static void main(String arg[]){
        Stack<Integer> marks=new Stack<Integer>();
        //push an element
        marks.push(88);
        marks.push(89);
        marks.push(90);
        marks.push(91);
        marks.push(91);
        marks.push(92);
        if(marks.empty())//it checks stack is empty ot not
          System.out.println("stack is empty");

        else
            System.out.println(marks.peek());
        System.out.println(marks.search(89));// it will give index value from top 
        marks.pop();
        System.out.println(marks.peek());
        //it removes top element from the stack








    }
}