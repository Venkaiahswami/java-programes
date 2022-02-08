import java.util.Arrays;
class ArrayCs{
    public static void main(String arg[]){

    int marks[]={22,52,33,44,55,66};
    int marks1[]={1,2,3,4,5,6};
    int marks2[]={1,2,3,5,5,6};

    
        for(int i=0;i<marks.length;i++)
             System.out.println(marks[i]);
        Arrays.sort(marks);//static method
        for(int i=0;i<marks.length;i++)
             System.out.print(marks[i]+ "\t");
        Arrays.sort(marks,3,6);//static method we can also sort from the middle of array by passing index values
        for(int i=0;i<marks.length;i++)
            System.out.println(marks[i]+ "\t");
            System.out.println(Arrays.binarySearch(marks,33));
            System.out.println(Arrays.equals(marks2,marks1));
    }
    
    
}