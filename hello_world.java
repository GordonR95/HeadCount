//1
/**
 * Gordon Richardson
 */
public class hello_world
{
    public static void main( String[] args ){
    System.out.print("Hello !!!!!"); 
JFrame f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("click");//creating instance of JButton  
b.setBounds(100,100,100, 100);//x axis, y axis, width, height  
          
f.add(b);//adding button in JFrame  
          
f.setSize(500,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
  
  
    }
}
