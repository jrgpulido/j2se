import java.awt.*;

public class MyFrame extends java.awt.Frame {

    public MyFrame (String str) {
	super(str);
    } 

    public static void main (String args[]) {
	MyFrame fr = new MyFrame("Hola UI world!");
	fr.setSize(1500,1000);
	fr.setBackground(java.awt.Color.green);
	fr.setVisible(true);
    } 
}
