class NoEven1{
    public static void main(String arg[]){
        int num=13245678;
        int count1=0;
        int count2=0;
        while(num>0){
            int rem=num%10;
            if(rem%2==0){
                count1++;
            }
            else{
                count2++;

            }
            num=num/10;
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}