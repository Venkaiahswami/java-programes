class Variables{
    String name;
    int Roll;
    int marks;
    int weight;
    void show(int a,int b){
        String name="swami";
         Roll=60;
         marks=55;
         weight=60;
        System.out.println(marks);
    }
}
class SaiKumar{
    public static void main(String args[]){
        Variables obj=new Variables();
        obj.show(33,55);
    }
}