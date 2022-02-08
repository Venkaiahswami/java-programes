import java.awt.*;
class GraphicsEx extends Frame
{
    public void paint(Graphics g){
       // drawLine(int x1, int y1, int x2, int y2)
       g.setColor(Color.red);
       g.drawLine(20,40, 100, 120);
       g.setColor(Color.green);
       g.fillOval(30,40,50,50);
       Font fnt=new Font("Arial",Font.BOLD,30);
       g.setFont(fnt);
    // g.setFont(new Font("Arial",Font.BOLD,30));
       g.drawString("swami gadu",100,100);

 
    }
    public static void main(String arg[]){
        GraphicsEx f=new GraphicsEx();//graphic object id direectly call paint method
        f.setSize(400,500);
        f.setVisible(true);
    }
}  