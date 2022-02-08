import java.awt.*;
class CardLayoutEx extends Frame
 {

    public static void main(String arg[]){
        CardLayoutEx obj=new CardLayoutEx();
        obj.setSize(300,300);
        obj.setVisible(true);
        obj.setBackground(Color.blue);
        //setting layout
        CardLayout f1=new CardLayout();
        //setting layout to the frame
        obj.setLayout(f1);
        // create a button
        Button b1=new Button("red");
        obj.add("red",b1);
        Button b2=new Button("blue");
        obj.add("blue",b2);
        Button b3=new Button("green");
        obj.add("green",b3);
        Button b4=new Button("voilet");
        obj.add("voilet",b4);
        Button b5=new Button("indigo");
        obj.add("indigo",b5);
        f1.last(obj);

        






    }
}