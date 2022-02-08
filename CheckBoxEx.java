// program to demonstrate checkbock in awt
import java.awt.*;
import java.awt.event.*;


class CheckBoxEx extends Frame implements ItemListener  {
    
    CheckBoxEx(){
        FlowLayout fl=new FlowLayout();
        this.setLayout(fl);
        Checkbox c1=new Checkbox("telugu",true);
        this.add(c1);
        c1.addItemListener(this);
        Checkbox c2=new Checkbox("english");
        this.add(c2);
        c2.addItemListener(this);
        Checkbox c3=new Checkbox("HINDI");
        this.add(c3);
        c3.addItemListener(this);

    }
    public void paint(Graphics g){
        g.drawString(c1.getState());
    }
    public  void itemStateChanged (ItemEvent e){// here itemEvent is class
          System.out.println(" you have selected "+e.getItem());
        

    } 
    public static void main(String arg[]){
        CheckBoxEx f=new CheckBoxEx();
        f.setSize(400,300);
        f.setVisible(true);


    }
}