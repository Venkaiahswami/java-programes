class Max1{
    public static void main(String arg[]){
        int a[]={1,2,1,4,5,6,4,5,};
        //int max=1;
    
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]+" "+i);


                }
            }

                
            
        }
    }
}