class BinarySearch{
    public static void main(String arg[]){
        int a[]={11,12,13,14,15,16,17,18,19,110};//should be in sorted order
        int key=12;
        boolean flag=false;
        int l=0;
        int h=a.length-1;
        System.out.print(h);
        while(l<=h){
            int m=(l+h)/2;
            System.out.println(m);
            if(a[m]==key){
                System.out.println("element found");
                flag=true;
                break;
            }
            if(key>a[m]){
                l=m+1;

            }
            if(key<a[m]){
                h=m-1;
            }
        }
        if(flag==false){
            System.out.println("element not found");
        }



       

    }
}