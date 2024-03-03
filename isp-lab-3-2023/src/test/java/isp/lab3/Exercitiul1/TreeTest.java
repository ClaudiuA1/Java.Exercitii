package isp.lab3.Exercitiul1;

import isp.lab3.exercise1.Tree;

import static org.junit.Assert.*;

import org.junit.Test;


public class TreeTest {

    Tree copac = new Tree();

    @Test
    public void Test_heigth() {
        assertEquals(38, copac.grow(23));
        assertEquals(38, copac.grow(-50));
        assertEquals("Tree height=38", copac.toString());

    }

}
