/**
 * Created by Romy Mae on 14-9-2016.
 */
//int is een heel getal, double is ook na komma
import java.awt.*;
import java.applet.*;

public class ZesPuntEen extends Applet {
    double a, b, c, uitkomst;

    public void init() {

        a = 113;
        b = 1;
        c = 4;
        uitkomst = a * (b / c);
    }

    public void paint(Graphics g) {
        //vier kinderen, dus 113 verdelen over 4
        g.drawString(" Jan krijgt " + uitkomst, 50, 50);
        g.drawString(" Ali krijgt " + uitkomst, 50, 70);
        g.drawString(" ik krijg " + uitkomst, 50, 90);
        g.drawString(" Jeannetta krijgt " + uitkomst, 50, 110);
    }
}