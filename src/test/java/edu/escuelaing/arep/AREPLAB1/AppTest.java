package edu.escuelaing.arep.AREPLAB1;

/*import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;*/

import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void primeraColumnaPrueba(){
        boolean resp = false;
        LinkedList lista = new LinkedList();
        lista.addNode(160);
        lista.addNode(591);
        lista.addNode(114);
        lista.addNode(229);
        lista.addNode(230);
        lista.addNode(270);
        lista.addNode(128);
        lista.addNode(1657);
        lista.addNode(624);
        lista.addNode(1503);
        Calculos programa = new Calculos(lista);
        DecimalFormat df = new DecimalFormat("#.00");
        String mean = df.format(programa.mean());
        String deviation = df.format(programa.deviation());
        String cMean =  "550,60";
        String cDeviation = "572,03";
        if(mean.equals(cMean) && deviation.equals(cDeviation)){
            resp = true;
        }
        assertTrue(resp);
    }

    @Test
    public void segundaColumnaPrueba(){
        boolean resp = false;
        LinkedList lista = new LinkedList();
        lista.addNode(15.0);
        lista.addNode(69.9);
        lista.addNode(6.5);
        lista.addNode(22.4);
        lista.addNode(28.4);
        lista.addNode(65.9);
        lista.addNode(19.4);
        lista.addNode(198.7);
        lista.addNode(38.8);
        lista.addNode(138.2);
        Calculos programa = new Calculos(lista);
        DecimalFormat df = new DecimalFormat("#.00");
        String mean = df.format(programa.mean());
        String deviation = df.format(programa.deviation());
        String cMean =  "60,32";
        String cDeviation = "62,26";
        if(mean.equals(cMean) && deviation.equals(cDeviation)){
            resp = true;
        }
        assertTrue(resp);
    }

}
