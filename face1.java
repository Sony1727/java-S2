import java.io.*;
import java.applet.*;
import java.awt.*;
/*
<Applet code="face1.java"width="500",height="600">
</Applet>
*/
public class face1 extends Applet
{
public void paint(Graphics g)
{
g.drawOval(40,10,120,200);
g.drawOval(57,75,30,20);
g.drawRect(100,150,30,20);
g.fillOval(100,150,200,250);
}
}