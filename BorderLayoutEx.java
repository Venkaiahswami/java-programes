// pgrom to demonstarate border layout
import java.awt.*;
class BorderLayoutEx extends Frame
 {

    public static void main(String arg[]){
        BorderLayoutEx obj=new BorderLayoutEx();
        obj.setSize(300,300);
        obj.setVisible(true);
        obj.setBackground(Color.blue);
        //setting layout
        BorderLayout f1=new BorderLayout(10,20);
        //setting layout to the frame
        obj.setLayout(f1);
        // create a button
        Button b1=new Button("red");
        obj.add(b1,BorderLayout.EAST);
        Button b2=new Button("blue");
        obj.add(b2,BorderLayout.WEST);
        Button b3=new Button("green");
        obj.add(b3,BorderLayout.SOUTH);
        Button b4=new Button("voilet");
        obj.add(b4,BorderLayout.NORTH);
        Button b5=new Button("indigo");
        obj.add(b5,BorderLayout.CENTER);
        






    }
}
