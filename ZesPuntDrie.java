/**
 * Created by Romy Mae on 14-9-2016.
 */
//int is een heel getal, double is ook na komma
import java.awt.*;
import java.applet.*;

public class ZesPuntDrie extends Applet {
 int a;
    int b;
    int uitkomst;

    public void init() {
a =2;
b=10;
 uitkomst= a+b;

    }

    public void paint(Graphics g) {
 g.drawString("uitkomst is -" +uitkomst, 20,20);
    }
}