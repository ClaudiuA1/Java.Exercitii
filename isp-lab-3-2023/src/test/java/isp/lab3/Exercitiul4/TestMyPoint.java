package isp.lab3.Exercitiul4;

import static org.junit.Assert.*;
import isp.lab3.exercise4.MyPoint;
import org.junit.Test;
public class TestMyPoint {

    static public void main(String[] args) {
        MyPoint punct=new MyPoint(13,-25,0);
        double j=punct.distance(142,78,-423);

              assertEquals(454.0693779589194, j, 0.0001);//0.0001 diferenta maxima acceptata


    }
}
