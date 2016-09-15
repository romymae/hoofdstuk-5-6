/**
 * Created by Romy Mae on 14-9-2016.
 */
//int is een heel getal, double is ook na komma
import java.awt.*;
import java.applet.*;

public class ZesPuntTwee extends Applet {
int a;
int b;
int c;
int d;
int uitkomsta;
int uitkomstb;
int uitkomstc;

    public void init() {
a = 60;
b = 60;
c = 24;
d= 365;
uitkomsta = a*b;
uitkomstb = (a*b)*c;
uitkomstc = ((a*b)*c)*d;
    }

    public void paint(Graphics g) {
g.drawString("seconde in een uur is " + uitkomsta, 20,20);
g.drawString("seconde in een dag is "+ uitkomstb, 20,40);
g.drawString("seconde in een jaar is " + uitkomstc, 20,60);
    }
}