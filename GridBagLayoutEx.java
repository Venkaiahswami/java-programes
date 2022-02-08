//program to demostrate GridBagLayout
import java.awt.*;
class GridBagLayoutEx extends Frame{
    public static void main(String arg[]){
        GridLayoutEx f=new GridLayoutEx();
        f.setSize(400,300);
        f.setVisible(true);
        GridBagLayout g1=new GridBagLayout();
        GridBagConstraints cons=new GridBagConstraints();
        f.setLayout(g1);
        cons.gridx=0;
        cons.gridy=0;
        cons.weightx=0.50;
        cons.weighty=0.30;

        Button b1=new Button("red");
        g1.setConstraints(b1,cons);
        f.add(b1);
        cons.gridx=0;
        cons.gridy=1;
        Button b2=new Button("blue");
        g1.setConstraints(b2,cons);
        f.add(b2);
        cons.gridx=1;
        cons.gridy=0;
        Button b3=new Button("green");
        g1.setConstraints(b3,cons);
        f.add(b3);
        cons.gridx=1;
        cons.gridy=1;
        Button b4=new Button("white");
        g1.setConstraints(b4,cons);
        f.add(b4);




        

    }
}