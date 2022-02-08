// program to demonstrate mouse listener
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;
class MouseListenerEx extends Frame 
{
    Button b1;
    MouseListenerEx(){
        FlowLayout f1=new FlowLayout();
        this.setLayout(f1);

        b1=new Button("click me");
        this.add(b1);
        b1.addMouseListener(new Ex()); 




    }
    
    public static void main(String arg[]){
        MouseListenerEx f=new MouseListenerEx();
        f.setSize(500,600);
        f.setVisible(true);

    }

}
class Ex extends MouseAdapter{
    public void mouseClicked(MouseEvent e){
        System.out.println("mouse nokkadu roy");
    }

}
 