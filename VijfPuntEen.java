/**
 * Created by RomyMae on 8-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class VijfPuntEen extends Applet {
    int breedte;
    int lengte;
    Color kleur;
    Color normaal;
    public void init() {
        breedte = 300;
        lengte =100;
kleur = Color.magenta;
        normaal = Color.black;
    }

    public void paint(Graphics g) {
//de lijn
        g.drawLine(10,10,300,10);
        g.drawString("lijn",150,30);
        //rechthoek
        g.drawRect(10,60,breedte,lengte);
        g.drawString("rechthoek",130,180);
        //ronde rechthoek
        g.drawRoundRect(10,210,breedte,lengte,30,30);
        g.drawString("afgeronde rechthoek",90,330);
        //gevulde rechthoek met ovaal
        g.setColor(kleur);
        g.fillRect(350,60,breedte, lengte);
        g.setColor(normaal);
        g.drawOval(350,60,breedte, lengte);
        g.drawString("gevulde rechthoek met ovaal",420,180
        );
        //ovaal
        g.setColor(kleur);
        g.fillOval(350,210,breedte, lengte);
        g.setColor(normaal);
        g.drawString("gevulde ovaal",450,330);
        //taartpunt in ovaal
        g.setColor(kleur);
        g.fillArc(700,60,breedte,lengte,0,45);
        g.setColor(normaal);
        g.drawOval(700,60,breedte, lengte);
        g.drawString("taartpunt met ovaal eromheen",760,180);
        //cirkel
        g.drawOval(800,210,100,100);
        g.drawString("cirkel",830,330);


    }
}