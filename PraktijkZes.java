package hoofstuk5en6; /**
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
    double gemiddelde;
    int afgekapt1;
    double afgekapt2;




    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        f = 10.0;
      gemiddelde = (a+b+c)/d;
        afgekapt1 = (int) (gemiddelde*e);
        afgekapt2 = (double) afgekapt1/f;



    }

    public void paint(Graphics g) {
        g.drawString("gemiddelde cijfer is " + afgekapt2, 20, 20);
    }
}


