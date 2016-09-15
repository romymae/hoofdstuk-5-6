/**
 * Created by Romy Mae on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;
//backup staat in go

public class PraktijkZes extends Applet {
    double a;
    double b;
    double c;
    double d;
    int e;
    double f;
    double uitkomst;




    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        f = 10.0;
        uitkomst = Math.round (((a + b + c) /d)*e)/f;



    }

    public void paint(Graphics g) {
        g.drawString("gemiddelde cijfer is " + uitkomst, 20, 20);
    }
}


