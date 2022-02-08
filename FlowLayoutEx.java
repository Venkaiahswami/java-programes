import java.awt.*;
class FlowLayoutEx extends Frame
 {

    public static void main(String arg[]){
        FlowLayoutEx obj=new FlowLayoutEx();
        obj.setSize(300,300);
        obj.setVisible(true);
        obj.setBackground(Color.blue);
        //setting layout
        FlowLayout f1=new FlowLayout(FlowLayout.LEFT,10,20);
        //setting layout to the frame
        obj.setLayout(f1);
        // create a button
        Button b1=new Button("red");
        obj.add(b1);
        Button b2=new Button("blue");
        obj.add(b2);
        Button b3=new Button("green");
        obj.add(b3);
        Button b4=new Button("voilet");
        obj.add(b4);
        Button b5=new Button("indigo");
        obj.add(b5);
        






    }
}