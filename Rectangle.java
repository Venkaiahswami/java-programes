class Rectangle 
          { 
             int length,breath; 
             Rectangle(int x,int y) 
                 { 
                    length=x; 
                    breath=y; 
                 } 
                    Rectangle(int x) 
                      { 
                          length=x; 
                          breath=10; 
                      } 
                          Rectangle() 
                            { 
                                length=31; 
                                breath=11; 
                            } 
                                float GetData() 
                                   { 
                                       return(length*breath); 
                                   } 
           } 
                   class ConstructorOverloading 
                          { 
                              public static void main(String args[]) 
                                 { 
                                     Rectangle Rect = new Rectangle(); 
                                     Rectangle Rect1 = new Rectangle(200); 
                                     Rectangle Rect2 = new Rectangle(200,700); 
                                     System.out.println("Area of First Rectangle is : "+Rect.GetData()); 
                                     System.out.println("Area of Secons Rectangle is : "+Rect1.GetData()); 
                                     System.out.println("Area of Third Rectangle is : "+Rect2.GetData()); 
                                 } 
                          }