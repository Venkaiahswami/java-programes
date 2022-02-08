class NoEven{
    public static void main(String arg[]){
        int num=222222;
        int rem;
        int count1=0;
        int count2=0;
        for(int i=0;i<=num;i++){
            rem=num%10;
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