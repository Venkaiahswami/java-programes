// program to demonstrate button in awt
import java.awt.*;
import java.awt.event.*;
class ButtonEx extends Frame implements ActionListener {
    ButtonEx(){
        FlowLayout f1=new FlowLayout();
        this.setLayout(f1);

        //step1 create the component
        Button b1=new Button("Red");  
        //add component to container
        this.add(b1);
        // add listener to the component
        b1.addActionListener(this);
        Button b2=new Button("blue");
        this.add(b2);  
        b2.addActionListener(this);
        Button b3=new Button("green");
        this.add(b3);  
        b3.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e){
   // System.out.println("button clicked");
           String bname=e.getActionCommand();
           if(bname.equals("red"))
               this.setBackground(Color.red);
           //set bgcolour to red
           if(bname.equals("blue"))
              this.setBackground(Color.blue);
           if(bname.equals("green"))
              this.setBackground(Color.green);


    }
    public static void main(String arg[]){
        ButtonEx f=new ButtonEx();
        f.setSize(400,300);
        f.setVisible(true); 



    }

}// visit window listener example