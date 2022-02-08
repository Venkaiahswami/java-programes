class ForLoop{
    public static void main(String args[]){
        for(int i=10;i>0;i--){
            System.out.println(i);
            if(i%2==0){
                System.out.println("even"+(i));
            }
            else{
                if(i%2!==0){
                    System.out.println("odd"+(i));
                
            }
        }
    }
}