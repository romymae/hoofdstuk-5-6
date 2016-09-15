/**
 * Created by Romy Mae on 14-9-2016.
 */
import java.awt.*;
import java.applet.*;
public class VijfPuntTwee extends Applet{

    int jeroen;
    int hans;
    int valerie;
    int gewichta;
    int gewichtb;
    int gewichtc;

    public void init() {
//dit is de plek waar de linkerhoek is
        jeroen = 100;
        hans = 120;
        valerie = 160;
        //dit is hoe lang de staaf is
        gewichta = 100;
        gewichtb = 80;
        gewichtc = 40;
    }
    public void paint(Graphics g) {
        //wanneer gewicht veranderd met bijv. plus 10
        //gewicht plus 10 naam min 10
        //uitkomst is dat het gewicht 10kg zwaarder is

        g.drawString("Valerie",100,210);
        g.drawString("40 kg",100,220);
        g.drawString("Jeroen",150,210);
        g.drawString("100 kg",150,220);
        g.drawString("Hans",200,210);
        g.drawString("80 kg",200,220);
        g.drawLine(90,200,240,200);
        g.drawLine(90,200,90,50);
        g.drawString("20 kg__",46,180);
        g.drawString("40 kg__",46,160);
        g.drawString("60 kg__",46,140);
        g.drawString("80 kg__",46,120);
        g.drawString("100 kg__",40,100);
        g.drawString("120 kg__",40,80);
        g.setColor(Color.pink);
        g.fillRect(100,valerie,40,gewichtc);
        g.setColor(Color.MAGENTA);
        g.fillRect(150,jeroen,40,gewichta);
        g.setColor(Color.blue);
        g.fillRect(200,hans,40,gewichtb);
    }
}