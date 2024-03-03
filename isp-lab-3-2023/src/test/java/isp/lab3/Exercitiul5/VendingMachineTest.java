package isp.lab3.Exercitiul5;

import static org.junit.Assert.*;

import isp.lab3.exercise5.VendingMachine;
import org.junit.Test;

public class VendingMachineTest {
    @Test
    public static void main(String[] args) {

        VendingMachine masina1 = new VendingMachine();

        masina1.displayProducts();
        masina1.displayCredit();
        assertEquals("Suma ta noua este: 23", masina1.insertCoin(23));


    }


}
