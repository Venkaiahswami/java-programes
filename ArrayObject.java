// program to demonstrate array objects
class Student{
    String name;
    int age;
    Student(String n,int a){
        name=n;
        age=a;
        //System.out.println("name" +name+ "age"+age);
    }

}
class ArrayObject{
    public static void main(String arg[]){
        //creating students objects
        Student s1=new Student("swami",21);
        Student s2=new Student("anil",22);
        Student s3=new Student("sainadh",23);
        Student s4=new Student("kishore",24);
        //storing objects into students array
        Student students[]=new Student[4];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;
        //retrive objects from array and access its name
         for(int i=0;i<students.length;i++){
            Student s=students[i];
            System.out.println(s.name);
            System.out.println(s.age);
            
            }
            

        }
        
        
        


    }